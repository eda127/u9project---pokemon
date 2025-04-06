public class StatusMove extends Move {
    String statusEffect = null;

    public StatusMove(String n, int p, String t, int l, String effN) {
        super(n, p, t, l);
        statusEffect = effN;
    }

    public StatusMove(String n, int p, String t, int l, int a, String effN) {
        super(n, p, t, l, a);
        statusEffect = effN;
    }

    public void setStatusEffect(Pokemon other) {
        if (other.getStatusEffect().equals(null)) {
            other.setStatusEffect(this.statusEffect);
        }
        else System.out.println(other.getName() + " already has a status effect!");
    }

    public void effectConsequences(Pokemon other) {
        if (this.statusEffect.equals("Paralyzed")) {
            if (Math.random() < 0.25) System.out.println(other.getName() + " is paralyzed and can't move!");
        }
        else if (this.statusEffect.equals("Burned")) {
            int burnAmount = other.getHp()/16;
            other.setAttack(other.getAttack()/2);  //halves the attack if its burnt
            other.setHp(other.getHp() - burnAmount);
            System.out.println(other.getName() + " is hurt by its burn! It took " + burnAmount + " damage.");
        }
        else if (this.statusEffect.equals("Poisoned")) {
            int poisonAmount = other.getHp()/8;
            other.setHp(other.getHp() - poisonAmount);
            System.out.println(other.getName() + " is hurt by its poison! It took " + poisonAmount + "damage.");
        }
        else if (this.statusEffect.equals("Sleep")) {
            int turnsAsleep = (int)((Math.random()*3) +1);
            System.out.println(other.getName() + " is asleep and can't move!"); 
        }
        else if (this.statusEffect.equals("Frozen")) {
            int turnsFrozen = (int)((Math.random()*3) +1);
            System.out.println(other.getName() + " is frozen and can't move!");
        }
        else if (this.statusEffect.equals("Arena spikes")) {
            int damageTaken = other.getHp()/16;
            other.setHp(other.getHp() - damageTaken);
            System.out.println(other.getName() + " is hurt from the arena spikes! It took " + damageTaken + "damage.");
            statusEffect = null;
        }
    }
}
