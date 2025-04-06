import java.lang.*;
public class Main {
  public static void main(String[] args) {
    Bulbasaur b = new Bulbasaur();
    Pidgey p = new Pidgey();
    Lucario l = new Lucario();
    Jolteon j = new Jolteon();
    Flygon f = new Flygon();
    

    Battle battle = new Battle(f, j);
    battle.start();
    }

  
  
}