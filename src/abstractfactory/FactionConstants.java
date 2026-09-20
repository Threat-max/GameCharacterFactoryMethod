package abstractfactory;

// Clean Code: no magic numbers/strings for weapon stats and names.
public final class FactionConstants {
    public static final int HUMAN_WEAPON_DAMAGE = 20;
    public static final int ORC_WEAPON_DAMAGE = 30;

    public static final String HUMAN_WEAPON_NAME = "Steel Longsword";
    public static final String ORC_WEAPON_NAME = "Rusty War Axe";

    private FactionConstants() {
        // utility class, should not be instantiated
    }
}
