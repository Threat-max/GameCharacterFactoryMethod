package abstractfactory;

public class HumanUnitFactory implements UnitFactory {
    @Override
    public Warrior createWarrior(String name) {
        return new HumanWarrior(name);
    }

    @Override
    public Weapon createWeapon() {
        return new HumanSword();
    }
}
