package abstractfactory;

// The Abstract Factory. One factory produces a whole family of matching
// objects (a warrior together with the weapon that belongs to his faction),
// so the client can never accidentally mix a Human warrior with an Orc axe.
public interface UnitFactory {
    Warrior createWarrior(String name);

    Weapon createWeapon();
}
