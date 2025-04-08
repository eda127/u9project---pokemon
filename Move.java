public class Move{
    String name;
    int power;
    String type;
    int accuracy;
    int level;

    String[] types = {"Normal","Fighting","Flying","Poison","Ground","Rock","Bug","Ghost","Steel","Fire","Water","Grass","Electric","Psychic","Ice","Dragon","Dark","Fairy"};
    //rows and columns follow same order as the types array before it.
    double[][] typeWeaknesses = {{1,2,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1},               //normal defending against ...
                                 {1,1,2,1,1,0.5,0.5,1,1,1,1,1,1,2,1,1,0.5,2},         //fighting defending against...
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},         //flying defending against...
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},
                                 {1,1,1,0.5,1,0.5,1,1,1,1,2,2,0,1,2,1,1,1},           //ground defending against...
                                 {0.5,2,0.5,0.5,2,1,1,1,2,0.5,2,2,1,1,1,1,1,1},
                                 {1,0.5,2,1,0.5,2,1,1,1,2,1,0.5,1,1,1,1,1,1},
                                 {0,0,1,0.5,1,1,0.5,2,1,1,1,1,1,1,1,1,2,1},
                                 {0.5,2,0.5,0,2,0.5,0.5,1,0.5,2,1,0.5,1,0.5,0.5,0.5,1,0.5},
                                 {1,1,1,1,2,2,0.5,1,0.5,0.5,2,0.5,1,1,0.5,1,1,0.5},
                                 {1,1,1,1,1,1,1,1,0.5,0.5,0.5,2,2,1,0.5,1,1,1}, 
                                 {1,1,2,2,0.5,1,2,1,1,2,0.5,0.5,0.5,1,2,1,1,1},
                                 {1,1,0.5,1,2,1,1,1,0.5,1,1,1,0.5,1,1,1,1,1},
                                 {1,0.5,1,1,1,1,2,2,1,1,1,1,1,0.5,1,1,2,1},
                                 {1,2,1,1,1,2,1,1,2,2,1,1,1,1,0.5,1,1,1},
                                 {1,1,1,1,1,1,1,1,1,0.5,0.5,0.5,0.5,1,2,2,1,2},
                                 {1,2,1,1,1,1,0.5,0.5,1,1,1,1,1,0,1,1,0.5,2},
                                 {1,0.5,1,2,1,1,1,1,1,2,1,1,1,1,1,1,0,0.5,1}};

    public Move(String n, int p, String t, int l){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracy = 100;
      this.level = 1;
    }

    public Move(String n, int p, String t, int l, int a){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracy = a;
      this.level = l;
    }

    public void changeLevelToPercent() {
        if (this.level == 1) this.level = 625;
        else if (this.level == 2) this.level = 1250;
        else if (this.level == 3) this.level = 2500;
        else this.level = 5000;
    }

    public int getPower(Pokemon current, Pokemon other){
      int power = this.power;
      System.out.println(this.name + "!");

      //checking if accuracy made the move miss
      int trueAcc = this.accuracy + current.getAccuracyModifier();         
      /*//debug
          System.out.println("        DEBUG 2 IN MOVE.java: Move accuracy = " + this.accuracy + ", Accuracy modifier = " + current.getAccuracyModifier() + ", true accuracy = " + trueAcc);
          int rand = (int)(Math.random()*100);
          System.out.println("        DEBUG 3 IN MOVE.java: rand num < trueAcc?  " + (rand < trueAcc));
          ///// */
      if ((int)(Math.random()*100) < (trueAcc) ) {
          
          //calling the changeLevelToPercent method first, checking if it is a crit hit. multiply by 1.5 if yes
          changeLevelToPercent();
          if ((int) (Math.random()*10000) < this.level) {
              power = (int)(this.power * 1.5);
          }
          else power = this.power;
          
          //checking the type damage
          power = (int) (power * typeDamage(other));

      }
      else {
          System.out.println(current.getName() + " missed!");
          return 0;
      }
      return power;
    }
    
    public double typeDamage(Pokemon other) {
        int moveTypePos = 0;
        int opponentTypePos = 0;

        //locating the position of the move and pokemon's type
        for (int i = 0; i < types.length; i++) {
            if (types[i].equals(this.type)) {
                moveTypePos = i;
            }
            else if (types[i].equals(other.getType())) {
                opponentTypePos = i;
            }
        }
        return typeWeaknesses[opponentTypePos][moveTypePos];
    }


    public int getPower() {
        return this.power;
    }

    public String getType() {
        return this.type;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    
    public String toString(){
      return this.name;
    }

  }