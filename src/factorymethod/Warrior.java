package factorymethod;

// Concrete product #1.
public class Warrior implements GameCharacter {
    private final String name;
    private final int health;

    public Warrior(String name, int health) {
        // Clean Code: validated construction - fail fast on invalid state.
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Warrior name cannot be empty");
        }
        if (health <= 0) {
            throw new IllegalArgumentException("Warrior health must be positive");
        }
        this.name = name;
        this.health = health;
    }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword for " + GameConstants.WARRIOR_DAMAGE + " damage!");
    }

    @Override
    public String describe() {
        return "Warrior " + name + " (HP: " + health + ")";
    }
}
