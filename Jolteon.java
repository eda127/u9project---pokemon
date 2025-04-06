public class Jolteon extends Pokemon {
    public Jolteon(){
        super("Jolteon", 65, 65, 60, "Electric", 130, new Move[] {
                new StatusMove("Thunder", 110, "Electric", 1, 70, "Paralyzed"), 
                new Move("Double Kick", 30, "Fighting", 3),
                new StatusMove("Thunder Fang", 65, "Electric", 1, 95, "Paralyzed"),
                new Move("Bite", 60, "Dark", 1)});
        }

}
