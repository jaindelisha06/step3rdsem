class q1 {

    private int health;
    private final int maxHealth;

    q1(int maxHealth) {

        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    void takeDamage(int amount) {

        health = health - amount;

        if (health < 0) {
            health = 0;
        }
    }

    void heal(int amount) {

        health = health + amount;

        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    int getHealth() {

        return health;
    }

    public static void main(String[] args) {

        q1 c = new q1(100);

        c.takeDamage(30);

        System.out.println(
            "Health after damage: " +
            c.getHealth()
        );

        c.heal(50);

        System.out.println(
            "Health after healing: " +
            c.getHealth()
        );

        c.takeDamage(150);

        System.out.println(
            "Health after extra damage: " +
            c.getHealth()
        );
    }
}