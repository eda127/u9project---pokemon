public class DebuffingMove extends Move {
    String stat;
    int debuffAmount;

    public DebuffingMove(String n, int p, String t, int l, int a, String s, int dbA) {
        super(n, p, t, l, a);
        this.stat = s;
        this.debuffAmount = dbA;
    }

    public DebuffingMove(String n, int p, String t, int l, String s, int dbA) {
        super(n, p, t, l);
        this.stat = s;
        this.debuffAmount = dbA;
    }

    public void changeStat(Pokemon a) {
        if (stat.toLowerCase().equals("speed")) {
            a.setSpeed(a.getSpeed() - debuffAmount);
            System.out.println(a.getName() + "'s speed decreased by "+ debuffAmount + "!");
        }

        else if (stat.toLowerCase().equals("defense")) {
            a.setDefense(a.getDefense() - debuffAmount);
            System.out.println(a.getName() + "'s' defense decreased by "+ debuffAmount + "!");
        }

        else if (stat.toLowerCase().equals("hp")) {
            a.setHp(a.getHp() - debuffAmount);
            System.out.println(a.getName() + "'s health decreased by "+ debuffAmount + "!");
        }

        else if (stat.toLowerCase().equals("attack")) {
            a.setAttack(a.getAttack() - debuffAmount);
            System.out.println(a.getName() + "'s attack decreased by "+ debuffAmount + "!");
        }
    }

}
