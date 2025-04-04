public class Move{
    String name;
    int power;
    String type;
    int accuracy;
    int level;
    String[] types = {"Normal","Fighting","Flying","Poison","Ground","Rock","Bug","Ghost","Steel","Fire","Water","Grass","Electric","Psychic","Ice","Dragon","Dark","Fairy"};
    double[][] typeWeaknesses = {{1,2,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1}, 
                                 {1,1,2,1,1,0.5,0.5,1,1,1,1,1,1,2,1,1,0.5,2},
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},
                                 {1,0.5,1,1,0,2,0.5,1,1,1,1,0.5,2,1,2,1,1,1},
                                 {1,1,1,0.5,1,0.5,1,1,1,1,2,2,0,1,2,1,1,1},
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

  
    public int getPower(){
      System.out.println(this.name + "!");
      //if accuracy hits
      if ((int) (Math.random()*100) < this.accuracy) {
          //if crit hit, multiply by 1.5
          if ((int) (Math.random()*10000) < this.level) {
            return (int) (this.power * 1.5);
          }
          else return this.power;
          
      }
      else {
          System.out.println(this.name + " missed!");
          return 0;
      }
    }

    
    public String toString(){
      return this.name;
    }

  }