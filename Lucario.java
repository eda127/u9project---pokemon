
public class Lucario extends Pokemon {
    public Lucario() {
        super("Lucario", 85, 50, 70, "Fighting", 100, new Move[] {
                    new BuffingMove("Swords Dance", 0, "Normal", 1, "attack", 10, 100),
                    new Move("Force Palm", 30, "Fighting", 1), 
                    new Move("Metal Claw", 25, "Steel", 1, 95), 
                    new Move("Aura Sphere", 40, "Fighting", 2), 
            });
    }
}
