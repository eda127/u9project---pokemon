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
        String s = stat.toLowerCase();
        
        if (s.equals("speed")) {
            a.setSpeed(a.getSpeed() + buffAmount);
            System.out.println(a.getName() + "'s speed increased by "+ buffAmount + "!");
        }

        else if (s.equals("defense")) {
            a.setDefense(a.getDefense() + buffAmount);
            System.out.println(a.getName() + "'s defense increased by "+ buffAmount + "!");
        }

        else if (s.equals("hp") || s.equals("health")) {
            a.setHp(a.getHp() + buffAmount);
            System.out.println(a.getName() + "'s health increased by "+ buffAmount + "!");
        }

        else if (s.equals("attack")) {
            a.setAttack(a.getAttack() + buffAmount);
            System.out.println(a.getName() + "'s attack increased by "+ buffAmount + "!");
        }
    }


}