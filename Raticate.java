
public class Raticate extends Pokemon {
    public Raticate() {
        super("Raticate", 55, 81, 60, "Normal", 97, new Move[] {
                    new Move("Bite", 40, "Dark", 1),
                    new Move("Crunch", 60, "Dark", 1), 
                    new DebuffingMove("Scary Face", 0, "Dark", 1, "speed", 7, 100), 
                    new Move("Sucker Punch", 55, "Normal", 2), 
            });
    }
}
