public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 10, 15, "Flying", 100, new Move[] {
                        new Move("tackle", 8, "Normal", 1), 
                        new Move("gust", 10, "Flying", 1, 95),
                        new DebuffingMove("sand attack", 0, "Ground", 1, "accuracy", 10),
                        new Move("quick attack", 4, "Normal", 1, 3)});
      }
    }