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
        System.out.println("        HERE I AM NUMBER 3 IN StatusMove  " + effect);

        if (effect == null) other.canMove(true);
        
        else if (effect.equals("paralysis")) {
            other.setStatusTurns(-1);
            if (Math.random() < 0.25) {
                System.out.println(other.getName() + " is paralyzed and can't move!");
                other.canMove(false);
            }
            else other.canMove(true);
        }

        else if (effect.equals("burn")) {
            other.setStatusTurns(-1);
            int burnAmount = other.getHp() / 16;
            other.setAttack(other.getAttack()/2);  //halves the attack if its burnt
            other.setHp(other.getHp() - burnAmount);
            System.out.println(other.getName() + " is hurt by its burn! It took " + burnAmount + " damage.");
        }

        else if (effect.equals("poison")) {
            other.setStatusTurns(-1);
            int poisonAmount = other.getHp() / 8;
            other.setHp(other.getHp() - poisonAmount);
            System.out.println(other.getName() + " is hurt by its poison! It took " + poisonAmount + "damage.");
        }

        else if (effect.equals("sleep")) {
            if (other.getStatusTurns() != 0 || other.getStatusTurns() != -1) {
                other.setStatusTurns((int)(Math.random() * 3) + 1);
            }
            if (other.getStatusTurns() > 0) {
                System.out.println(other.getName() + " is asleep and can't move!");
                other.decreaseStatusTurns();
                other.canMove(false);
            }
            else {
                System.out.println(other.getName() + " woke up!");
                other.removeStatusEffect();
                other.setStatusTurns(0);
                other.canMove(true);
            }
        }

        else if (effect.equals("frozen")) {
            if (other.getStatusTurns() != 0 || other.getStatusTurns() != -1) {
                other.setStatusTurns((int)(Math.random() * 3) + 1);
                
                //debug
                System.out.println("        OH NO IM FROZEN (IN StatusMove)  " + other.getStatusTurns());
            }
            if (other.getStatusTurns() > 0) {
                System.out.println(other.getName() + " is frozen and can't move!");
                other.canMove(false);
                other.decreaseStatusTurns();

                //debug
                System.out.println("        IM ACTUALLY FROZEN (IN STATUSMOVE)");
            }

            else {
                System.out.println(other.getName() + " is no longer frozen!");
                other.removeStatusEffect();
                other.setStatusTurns(0);
                other.canMove(true);
            }
            // System.out.println(other.getName() + " is frozen and can't move!");
        }

        else if (effect.equals("arena spikes")) {
            int damageTaken = other.getHp() / 16;
            other.setHp(other.getHp() - damageTaken);
            System.out.println(other.getName() + " is hurt from the arena spikes! It took " + damageTaken + "damage.");
            other.setStatusEffect(null);
        }

        else if (effect.equals("heal")) {    //maybe remove this and make it a BuffingMove()
            int healingAmount = other.getHp() / 16;
            other.setHp(other.getHp() + healingAmount);
            System.out.println(other.getName() + " restored " + healingAmount + " health.");
        }

        else if (effect.equals("confusion")) {
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
