public class Jolteon extends Pokemon {
  
        public Jolteon(){
          super("Bulbasaur", 65, 65, 60, "Electric", new Move[] {
                          new Move("Thunder", 110, "Electric", 1, 70), 
                          new Move("Double Kick", 30, "Fighting", 3),
                          new Move("Thunder Fang", 65, "Electric", 1, 95),
                          new Move("Bite", 60, "Dark", 1)});
        }

}
