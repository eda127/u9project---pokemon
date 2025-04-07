public class Lucario extends Pokemon {
    public Lucario() {
        super("Lucario", 85, 110/2, 70, "Fighting", 100, new Move[] {
                    new BuffingMove("Swords Dance", 0, "Normal", 1, "attack", 10, 100),
                    new Move("Force Palm", 60/2, "Fighting", 1), 
                    new Move("Metal Claw", 50/2, "Steel", 1, 95), 
                    new Move("Aura Sphere", 80/2, "Fighting", 2), 
            });
    }
}
