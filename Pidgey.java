public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 10, 15, "Flying", new Move[] {
                        new Move("tackle", 8, "Normal"), 
                        new Move("gust", 10, "Flying"),
                        new Move("sand attack", 0, "Ground"),
                        new Move("quick attack", 4, "Normal")});
      }
    }