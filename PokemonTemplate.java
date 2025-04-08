/*
public class PokemonTemplate extends Pokemon {
    public PokemonTemplate() {
                //name, hp, attack, defense, type, speed, Move[] {
        super("NAME", hp, attack, defense, "TYPE", speed, new Move[] {
                    new Move("NAME", power, "TYPE", level (1-4), accuracy (not required) ),
                    new EffectMove("NAME", power, "TYPE", level (1-4), accuracy (not required), "STATUS EFFECT NAME", status infliction chance), 
                    new BuffingMove("NAME", power, "TYPE", level (1-4), accuracy (not required), "STAT TO BUFF", buff amount, chance it buffs), 
                    new DebuffingMove("NAME", power, "TYPE", level (1-4), accuracy (not requried), "STAT TO DEBUFF", debuff amount, chacn it debuffs), 
            });
    }
}


    /////////////////////////////////////////////////////////////////////////////////////////////
    public DebuffingMove(String n, int p, String t, int l, int a, String s, int dbA, int iC) {
        super(n, p, t, l, a);
        this.stat = s;
        this.debuffAmount = dbA;
        this.inflictionChance = iC;
    }

    public DebuffingMove(String n, int p, String t, int l, String s, int dbA, int iC) {
        super(n, p, t, l);
        this.stat = s;
        this.debuffAmount = dbA;
        this.inflictionChance = iC;
    }


    public BuffingMove(String n, int p, String t, int l, int a, String s, int bA, int iC) {
        super(n, p, t, l, a);
        this.stat = s;
        this.buffAmount = bA;
        this.inflictionChance = iC;
    }

    public BuffingMove(String n, int p, String t, int l, String s, int bA, int iC) {
        super(n, p, t, l);
        this.stat = s;
        this.buffAmount = bA;
        this.inflictionChance = iC;
    }


    public EffectMove(String n, int p, String t, int l, String effN, int iC) {
        super(n, p, t, l);
        statusEffect = effN;
        inflictionChance = iC;
    }

    public EffectMove(String n, int p, String t, int l, int a, String effN, int iC) {
        super(n, p, t, l, a);
        statusEffect = effN;
        inflictionChance = iC;
    }


    public Move(String n, int p, String t, int l){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracy = 100;
      this.level = 1;
    }

    public Move(String n, int p, String t, int l, int a){
      this.name = n;
      this.power = p;
      this.type = t;
      this.accuracy = a;
      this.level = l;
    }

*/