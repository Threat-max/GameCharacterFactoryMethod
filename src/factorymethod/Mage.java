package factorymethod;

// Concrete product #2.
public class Mage implements GameCharacter {
    private final String name;
    private final int health;

    public Mage(String name, int health) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Mage name cannot be empty");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Mage health must be positive");
        }
        this.name = name;
        this.health = health;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball for " + GameConstants.MAGE_DAMAGE + " damage!");
    }

    @Override
    public String describe() {
        return "Mage " + name + " (HP: " + health + ")";
    }
}
