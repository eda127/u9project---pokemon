public class Flygon extends Pokemon {
    public Flygon() {
        super("Flygon", 80, 100, 80, "Ground", new Move[] {
                    new Move("Dragon Claw", 80, "Dragon", 1), 
                    new Move("Earthquake", 100, "Ground", 1),
                    new Move("Sandstorm", 0, "Rock", 1), 
                    new Move("Dragon Tail", 60, "Dragon", 1, 90), 
            });
    }
}
