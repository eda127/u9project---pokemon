 
public class KriKri extends Pokemon {
    public KriKri() {
        super("KriKri", 100, 70, 1, "Electric", 70, new Move[] {
                    new Move("Low Kick", 97, "Normal", 4, 90),
                    new EffectMove("Burp", 99, "Dark", 2, "sleep", 40), 
                    new EffectMove("Fart", 10, "Psychic", 3, "paralysis", 30), 
                    new Move("Poop", 75, "Dark", 1), 
            });
    }
    
}
