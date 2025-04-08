
public class Poliwrath extends Pokemon {
    public Poliwrath() {
        super("Poliwrath", 90, 95, 95, "Water", 70, new Move[] {
                    new DebuffingMove("Icy Wind", 30, "Ice", 1, 95, "speed", 10, 100),
                    new EffectMove("Ice Beam", 50, "Ice", 1, "frozen", 10), 
                    new EffectMove("Body Slam", 40, "Fighting", 1, "paralysis", 30), 
                    new Move("Surf", 55, "Water", 1), 
            });
    }
}
