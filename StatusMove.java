public class StatusMove extends Move {
    String statusEffect = null;
    int inflictionChance;
    int turnsUntilFree = 0;

    public StatusMove(String n, int p, String t, int l, String effN, int iC) {
        super(n, p, t, l);
        statusEffect = effN;
        inflictionChance = iC;
    }

    public StatusMove(String n, int p, String t, int l, int a, String effN, int iC) {
        super(n, p, t, l, a);
        statusEffect = effN;
        inflictionChance = iC;
    }

    public int getInflictionChance() {
        return inflictionChance;
    }

    public void setStatusEffect(Pokemon other) {
        if (other.getStatusEffect().equals(null)) {
            other.setStatusEffect(this.statusEffect);
        }
        else System.out.println(other.getName() + " already has a status effect!");
    }

    public String getStatusEffect() {
        return statusEffect;
    }

    public static void effectConsequences(Pokemon other) {
        String effect = other.getStatusEffect();
        
        if (effect.equals("Paralyzed")) {
            if (Math.random() < 0.25) System.out.println(other.getName() + " is paralyzed and can't move!");
        }

        else if (effect.equals("Burned")) {
            int burnAmount = other.getHp() / 16;
            other.setAttack(other.getAttack()/2);  //halves the attack if its burnt
            other.setHp(other.getHp() - burnAmount);
            System.out.println(other.getName() + " is hurt by its burn! It took " + burnAmount + " damage.");
        }

        else if (effect.equals("Poisoned")) {
            int poisonAmount = other.getHp() / 8;
            other.setHp(other.getHp() - poisonAmount);
            System.out.println(other.getName() + " is hurt by its poison! It took " + poisonAmount + "damage.");
        }

        else if (effect.equals("Sleep")) {
            if (other.getStatusTurns() == 0) {
                System.out.println(other.getName() + " is no longer asleep!");
                other.removeStatusEffect();
                other.setStatusTurns(0);
            }
            else {
                System.out.println(other.getName() + " is asleep and can't move!"); 
                other.decreaseStatusTurns();
            }
        }

        else if (effect.equals("Frozen")) {
            System.out.println(other.getName() + " is frozen and can't move!");
        }

        else if (effect.equals("Arena spikes")) {
            int damageTaken = other.getHp() / 16;
            other.setHp(other.getHp() - damageTaken);
            System.out.println(other.getName() + " is hurt from the arena spikes! It took " + damageTaken + "damage.");
            other.setStatusEffect(null);
        }

        else if (effect.equals("Heal")) {
            int healingAmount = other.getHp() / 16;
            other.setHp(other.getHp() + healingAmount);
            System.out.println(other.getName() + " restored " + healingAmount + " health.");
        }

        else if (effect.equals("Confusion")) {
            boolean hurtsItself = false;
            int damageTaken = 0;
            if (Math.random() < 0.333) hurtsItself = true;
            if (hurtsItself) {
                damageTaken = other.getHp() / 12;
                other.setHp(other.getHp() - damageTaken);
                System.out.println(other.getName() + " hurt itself in confusion!");
            }
        }
    }
}
