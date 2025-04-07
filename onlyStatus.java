public class onlyStatus extends Pokemon {
    public onlyStatus(){
        super("statusPokemon", 100, 20, 70, "Normal", 50, new Move[] {
                        new BuffingMove("Amnesia", 0, "Psychic", 1, "defense", 15, 100), 
                        new StatusMove("Sing a lulabye", 0, "Normal", 1, "Sleep", 100),
                        new StatusMove("Roost", 0, "Flying", 1, "Heal", 100),
                        new StatusMove("Ice Beam", 90, "Ice", 1, "Freeze", 100)});
      }
}
