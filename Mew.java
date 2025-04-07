
public class Mew extends Pokemon {
    public Mew() {
        super("Mew", 100, 100, 100, "Psychic", 100, new Move[] {
                    new DebuffingMove("Psychic", 90, "Psychic", 1, "defense", 10, 100),
                    new BuffingMove("Nasty Plot", 0, "Dark", 1, "attack", 20, 100), 
                    new BuffingMove("Close Combat", 120, "Fighting", 1, "defense", -20, 100), 
                    new Move("Poltergeist", 110, "Ghost", 1, 90), 
            });
    }
}
