public class Pokemon{
    String name;
    int hp;
    int attack;
    int defense;
    String type;
    int speed;
    int accuracyModifier = 0;
    String statusEffect = "none";
    int statusTurns = 0;
    boolean canMove = true;
    Move[] moveList;

    public Pokemon(String n, int hp, int attack, int defense, String type, int speed, Move[] moves){
        this.name = n;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.type = type;
        this.speed = speed;
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
        return attack;
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

    public int getAccuracyModifier() {
        return this.accuracyModifier;
    }
    
    public void setAccuracyModifier(int a) {
        this.accuracyModifier = a;
    }


    // status effect methods
    public String getStatusEffect() {
        return this.statusEffect;
    }

    public void setStatusEffect(String s) {
        this.statusEffect = s;
        System.out.println(name + " now has the " + statusEffect + " effect!");  //change this bc it could print smth like "name is now Sleep"
    }
    
    public void removeStatusEffect() {
        if (statusEffect.equals("burn")) {
            attack *= 2; //restores the halving of the attack if it got burnt
        }
        System.out.println(name + " no longer has the " + statusEffect + " effect!");  //same with this line
        this.statusEffect = "none";
    }

    public void setStatusTurns(int i) {
        statusTurns = i;
    }

    public int getStatusTurns() {
        return this.statusTurns;
    }

    public void decreaseStatusTurns() {
        statusTurns--;
    }

    public void canMove(boolean b) {
        this.canMove = b;
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