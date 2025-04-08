import java.util.*;
public class Battle{
  Pokemon p1;
  Pokemon p2;

  public Battle(Pokemon p1, Pokemon p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public Move moveChoice(Pokemon p){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Choose a move:");
    int i = 1;
    for(Move move:p.getMoveList()){
      System.out.println(i + ": " + move + "  (" + move.getPower() + " power, " + move.getType() + " type)");
      i++;
    }
    int choice = input.nextInt();
    if(choice == 1){
      return p.getMoveList()[0];
    }
    else if(choice == 2){
      return p.getMoveList()[1];
    }
    else if(choice == 3){
      return p.getMoveList()[2];
    }
    else{
      return p.getMoveList()[3];
    }
  }

  public void turn(Pokemon a, Pokemon b){
    System.out.println(a + "'s turn!");

          /*//debugging only
          int health = a.getHp();
          int attack = a.getAttack();
          int defense = a.getDefense();
          int speed = a.getSpeed();
          String effect = a.getStatusEffect();
          System.out.println("        health: " + health + "  attack: " + attack + "  defense:" + defense + "  speed:" + speed + "  status effect:" + effect + " status turns: " + a.statusTurns + " canMove: " + a.canMove);
          //end of debugging code*/

      // stops turn if pokemon can't move
      if (!a.canMove) {
          return;
      }
      Move move = moveChoice(a);

      // if the move gives a status effect
      if (move instanceof EffectMove) {
          EffectMove sMove = (EffectMove)move;
          // has a .getInflictionChance() chance of applying effect, then applies damage
          if (Math.random()*100 < (sMove.getInflictionChance())) {
              b.setStatusEffect(sMove.getStatusEffect());
              int power = move.getPower(b);
              int damage = (int)(power * ((double)a.getAttack())/b.getDefense());
              System.out.println(b + " took " + damage + " damage.");
              b.damage(damage);
              System.out.println(b + " has " + Math.max(b.getHp(), 0) + " hit points left."); 
          }
          else System.out.println(a.getName() + " missed!");
      }
      
      // check if the move buffs or debuffs second
      else if (move instanceof BuffingMove) {
          ((BuffingMove) move).changeStat(a);
      }
      else if (move instanceof DebuffingMove) {
          ((DebuffingMove) move).changeStat(b);
      }
    
      // if neither status move or buff/debuff move, do damage
      else {
          int power = move.getPower(b);
          int damage = (int)(power * ((double)a.getAttack())/b.getDefense());
          System.out.println(b + " took " + damage + " damage.");
          b.damage(damage);
          System.out.println(b + " has " + Math.max(b.getHp(), 0) + " hit points left."); 
      }

      // applying status effect to current pokemon, if it has one. if no status, nothing happens. 
      //only happens at end of turn
      EffectMove.effectConsequences(a);

      System.out.println("End of " + a.getName() + "'s turn.\n");
  }

  public void start(){
    // checking speed. if pokemon 2 is faster, switch their names. otherwise, continue as normal
    if (p2.getSpeed() > p1.getSpeed()) {
        Pokemon temp = p2;
        p2 = p1;
        p1 = temp;
    }
    System.out.println("A wild " + p2 + " has appeared! I choose you, " + p1);
    int turn = 0;
    while(p1.getHp() > 0 && p2.getHp() > 0){
      if(turn % 2 == 0){
        turn(p1, p2);
      }
      else{
        turn(p2, p1);
      }
        turn++;
    }
    if(p1.getHp() == 0){
        System.out.println(p1 + " fainted! " + p2 + " wins!");
    }
    else{
      System.out.println(p2 + " fainted! " + p1 + " wins!");
    }
  }
}