public class DebuffingMove extends Move {
    String stat;
    int debuffAmount;
    int inflictionChance;

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

    public void changeStat(Pokemon other) {
        String s = stat.toLowerCase();

        if (s.equals("speed")) {
            other.setSpeed(other.getSpeed() - debuffAmount);
            System.out.println(other.getName() + "'s speed decreased by "+ debuffAmount + "!");
        }

        else if (s.equals("defense")) {
            other.setDefense(other.getDefense() - debuffAmount);
            System.out.println(other.getName() + "'s' defense decreased by "+ debuffAmount + "!");
        }

        else if (s.equals("hp") || s.equals("health")) {
            other.setHp(other.getHp() - debuffAmount);
            System.out.println(other.getName() + "'s health decreased by "+ debuffAmount + "!");
        }

        else if (s.equals("attack")) {
            other.setAttack(other.getAttack() - debuffAmount);
            System.out.println(other.getName() + "'s attack decreased by "+ debuffAmount + "!");
        }
        else if (s.equals("accuracy")) {
            other.setAccuracyModifier(other.getAccuracyModifier() - debuffAmount);
            System.out.println(other.getName() + "'s accuracy fell by " + debuffAmount + "!");
        }
    }

}
