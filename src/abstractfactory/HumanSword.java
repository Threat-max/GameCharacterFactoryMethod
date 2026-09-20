package abstractfactory;

public class HumanSword implements Weapon {
    @Override
    public String getName() {
        return FactionConstants.HUMAN_WEAPON_NAME;
    }

    @Override
    public int getDamage() {
        return FactionConstants.HUMAN_WEAPON_DAMAGE;
    }
}
