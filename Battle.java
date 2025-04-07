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

      //debugging only
      int health = p.getHp();
      int attack = p.getAttack();
      int defense = p.getDefense();
      int speed = p.getSpeed();
      String effect = p.getStatusEffect();
      System.out.println("health: " + health + "  attack: " + attack + "  defense:" + defense + "  speed:" + speed + "  status effect:" + effect + " status turns: " + p.statusTurns);
      //end of debugging code
    
    System.out.println("Choose a move:");
    int i = 1;
    for(Move move:p.getMoveList()){
      System.out.println(i + ": " + move);
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
        Move move = moveChoice(a);

        // applying status effect to current pokemon, if it has one
        if (a.getStatusEffect() != null) {
            //then, apply status effect
            StatusMove.effectConsequences(a);
        }

        // giving status effect to other pokemon if turn not skipped and move is a status effect move
        if (move instanceof StatusMove) {
            StatusMove sMove = (StatusMove)move;
            if (Math.random()*100 < (sMove.getInflictionChance())) {
                b.setStatusEffect(sMove.getStatusEffect());
                
                // if the status is sleep or freeze, its active for 1-3 turns only
                if (sMove.getStatusEffect().equals("Sleep") || sMove.getStatusEffect().equals("Frozen")) {
                    b.setStatusTurns((int)(Math.random() * 3) +1);
                }
                else b.setStatusTurns(-1);
            }
        }

        // check if the move buffs or debuffs second
        if (move instanceof BuffingMove) {
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