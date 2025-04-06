public class Flygon extends Pokemon {
    public Flygon() {
        super("Flygon", 80, 100, 80, "Ground", 100, new Move[] {
                new Move("Dragon Claw", 80, "Dragon", 1), 
                new Move("Earthquake", 100, "Ground", 1),
                new StatusMove("Sandstorm", 0, "Rock", 1, "Spikes"), 
                new Move("Dragon Tail", 60, "Dragon", 1, 90), 
            });
    }
}
