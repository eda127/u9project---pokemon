
public class Pelipper extends Pokemon {
    public Pelipper() {
        super("Pelipper", 60, 50, 100, "Water", 65, new Move[] {
                new Move("Wing Attack", 60, "Flying", 2), 
                new EffectMove("Water Pulse", 60, "Water", 1, "Confusion", 20),
                new EffectMove("Aqua Ring", 0, "Water", 1, "Heal", 100), 
                new EffectMove("Blizzard", 110, "Ice", 1, 70, "Frozen", 10)
            });
    }
}