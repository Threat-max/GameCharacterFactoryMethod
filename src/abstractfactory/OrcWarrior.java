package abstractfactory;

public class OrcWarrior implements Warrior {
    private final String name;

    public OrcWarrior(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Warrior name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println(name + " the Orc Warrior roars and smashes forward!");
    }
}
