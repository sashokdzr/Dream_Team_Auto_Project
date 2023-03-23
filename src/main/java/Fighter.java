public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Tom", 90, 7);
        Fighter fighter2 = new Fighter("Nick", 120, 5);
        System.out.println(declareWinner(fighter1, fighter2, "Nick"));
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;

                if (fighter2.health > 0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                } else {
                    break;
                }
            }
        } else {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                if (fighter1.health > 0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                } else {
                    break;
                }
            }
        }
        if (fighter1.health > 0) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }

        // Your code goes here. Have fun!
    }
}
