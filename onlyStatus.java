
public class onlyStatus extends Pokemon {
    public onlyStatus(){
        super("statusPokemon", 100, 20, 70, "Normal", 50, new Move[] {
                        new BuffingMove("Amnesia", 0, "Psychic", 1, "defense", 15, 100), 
                        new EffectMove("Sing a lulabye", 0, "Normal", 1, "sleep", 100),
                        new EffectMove("Wil-o-wisp", 35, "Fire", 1, "burn", 100),
                        new EffectMove("Ice Beam", 90, "Ice", 1, "frozen", 100)});
      }
}
