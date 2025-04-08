public class Flygon extends Pokemon {
    public Flygon() {
        super("Flygon", 80, 50, 80, "Ground", 100, new Move[] {
                new Move("Dragon Claw", 45, "Dragon", 1), 
                new Move("Earthquake", 60, "Ground", 1),
                new EffectMove("Sandstorm", 0, "Rock", 1, "arena spikes", 100), 
                new Move("Dragon Tail", 35, "Dragon", 1, 90), 
            });
    }
}
