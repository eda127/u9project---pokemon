import java.lang.*;
public class Main {
  public static void main(String[] args) {
    Bulbasaur b = new Bulbasaur();
    Pidgey p = new Pidgey();

    Lucario l = new Lucario();
    Jolteon j = new Jolteon();
    Flygon f = new Flygon();
    Pelipper pp = new Pelipper();
    onlyStatus o = new onlyStatus();
    Raticate r = new Raticate();
    Poliwrath pr = new Poliwrath();

    Battle battle = new Battle(pr, j);
    battle.start();
    }

  
  
}