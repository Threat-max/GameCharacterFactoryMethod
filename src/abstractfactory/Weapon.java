package abstractfactory;

// Abstract product #2 of the family. A Warrior and a Weapon from the same
// faction always belong together - that pairing is exactly what Abstract
// Factory guarantees.
public interface Weapon {
    String getName();

    int getDamage();
}
