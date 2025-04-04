public class Bulbasaur extends Pokemon{
  
    public Bulbasaur(){
      super("Bulbasaur", 50, 10, 15, "Grass", new Move[] {
                      new Move("tackle", 8, "Normal", 1,95), 
                      new Move("tail whip", 0, "Normal", 1),
                      new Move("vine whip", 10, "Grass", 3),
                      new Move("bite", 10, "Normal", 1)});
    }
  
  }