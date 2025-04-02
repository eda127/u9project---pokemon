public class Lucario extends Pokemon {
    public Lucario() {
        super("Lucario", 85, 110, 70, "Fighting", new Move[] {
                    new Move("Swords Dance", 0, "Normal", 1), 
                    new Move("Force Palm", 60, "Fighting", 1), 
                    new Move("Metal Claw", 50, "Steel", 1, 95), 
                    new Move("Aura Sphere", 80, "Fighting", 2), 
            });
    }
}
