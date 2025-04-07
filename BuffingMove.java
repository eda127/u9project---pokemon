public class BuffingMove extends Move {
    String stat;
    int buffAmount;
    int inflictionChance;

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

    public void changeStat(Pokemon a) {
        if (stat.toLowerCase().equals("speed")) {
            a.setSpeed(a.getSpeed() + buffAmount);
            System.out.println(a.getName() + "'s speed increased by "+ buffAmount + "!");
        }

        else if (stat.toLowerCase().equals("defense")) {
            a.setDefense(a.getDefense() + buffAmount);
            System.out.println(a.getName() + "'s defense increased by "+ buffAmount + "!");
        }

        else if (stat.toLowerCase().equals("hp") || stat.toLowerCase().equals("health")) {
            a.setHp(a.getHp() + buffAmount);
            System.out.println(a.getName() + "'s health increased by "+ buffAmount + "!");
        }

        else if (stat.toLowerCase().equals("attack")) {
            a.setAttack(a.getAttack() + buffAmount);
            System.out.println(a.getName() + "'s attack increased by "+ buffAmount + "!");
        }
    }


}