package abstractfactory;

public class OrcUnitFactory implements UnitFactory {
    @Override
    public Warrior createWarrior(String name) {
        return new OrcWarrior(name);
    }

    @Override
    public Weapon createWeapon() {
        return new OrcAxe();
    }
}
