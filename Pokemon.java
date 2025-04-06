public class Pokemon{
    String name;
    int hp;
    int attack;
    int defense;
    String type;
    int speed;
    int baseAccuracy = 100;
    String statusEffect;
    Move[] moveList;

    public Pokemon(String n, int hp, int attack, int defense, String type, int speed, Move[] moves){
      this.name = n;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.type = type;
      this.moveList = moves;
    }
  
    public String getName() {
      return name;
    }

    public int getHp(){
      return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
  
    public void damage(int amount){
      hp -= amount;
    }
  
    public int getDefense(){
      return defense;
    }

    public void setDefense(int d) {
        this.defense = d;
    }
  
    public int getAttack(){
      if ((int)(Math.random()*100) <= baseAccuracy) return attack;
      else return 0; //doesnt say that "attack missed!" because of accuracy. have to say
    }

    public void setAttack(int a) {
        this.attack = a;
    }
  
    public String getType(){
      return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        this.speed = s;
    }


    // status effect
    public String getStatusEffect() {
        return this.statusEffect;
    }

    public void setStatusEffect(String s) {
        this.statusEffect = s;
        System.out.println(name + " is now " + statusEffect + "!");
    }
    
    public void removeStatusEffect() {
        System.out.println(name + " is no longer " + statusEffect + "!");
        this.statusEffect = null;
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