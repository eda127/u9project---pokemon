public class Pokemon{
    String name;
    int hp;
    int attack;
    int defense;
    String type;
    Move[] moveList;
  
    public Pokemon(String n, int hp, int attack, int defense, String type, Move[] moves){
      this.name = n;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.type = type;
      this.moveList = moves;
    }
  
    public int getHp(){
      return hp;
    }
  
    public void damage(int amount){
      hp -= amount;
    }
  
    public int getDefense(){
      return defense;
    }
  
    public int getAttack(){
      return attack;
    }
  
    public String getType(){
      return type;
    }
  
    public Move[] getMoveList(){
      return this.moveList;
    }
  
    public int typeAdjustment(){
      return 0;
    }
  
    public String toString(){
      return this.name;
    }
  }