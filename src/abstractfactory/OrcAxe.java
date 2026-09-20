package abstractfactory;

public class OrcAxe implements Weapon {
    @Override
    public String getName() {
        return FactionConstants.ORC_WEAPON_NAME;
    }

    @Override
    public int getDamage() {
        return FactionConstants.ORC_WEAPON_DAMAGE;
    }
}
