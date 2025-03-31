public class Bulbasaur extends Pokemon{
  
    public Bulbasaur(){
      super("Bulbasaur", 50, 10, 15, "Grass", new Move[] {
                      new Move("tackle", 8, "Normal"), 
                      new Move("tail whip", 0, "Normal"),
                      new Move("vine whip", 10, "Grass"),
                      new Move("bite", 10, "Normal")});
    }
  
  }