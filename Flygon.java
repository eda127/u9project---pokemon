public class Flygon extends Pokemon {
    public Flygon() {
        super("Flygon", 80, 100, 80, "Ground", new Move[] {
                    new Move("Dragon Claw", 80, "Dragon"), 
                    new Move("Earthquake", 100, "Ground"), 
                    new Move("Sandstorm", 0, "Rock"), 
                    new Move("Dragon Tail", 60, "Dragon"), 
            });
    }
}
