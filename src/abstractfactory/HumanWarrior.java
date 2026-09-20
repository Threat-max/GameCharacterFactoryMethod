package abstractfactory;

public class HumanWarrior implements Warrior {
    private final String name;

    public HumanWarrior(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Warrior name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " the Human Warrior charges bravely into battle!");
    }
}
