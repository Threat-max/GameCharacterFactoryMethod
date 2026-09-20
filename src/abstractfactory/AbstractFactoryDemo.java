package abstractfactory;

// Part B demo. Same client code (equipArmy) works for any faction - the
// UnitFactory guarantees the warrior and the weapon always match.
public class AbstractFactoryDemo {

    private static void equipArmy(UnitFactory factory, String warriorName) {
        Warrior warrior = factory.createWarrior(warriorName);
        Weapon weapon = factory.createWeapon();

        System.out.println(warriorName + " is equipped with " + weapon.getName()
                + " (" + weapon.getDamage() + " damage)");
        warrior.attack();
    }

    public static void main(String[] args) {
        UnitFactory humans = new HumanUnitFactory();
        equipArmy(humans, "Arthur");

        UnitFactory orcs = new OrcUnitFactory();
        equipArmy(orcs, "Grokk");
    }
}
