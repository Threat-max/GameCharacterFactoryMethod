package factorymethod;

// Clean Code: no magic numbers/strings. All balance values live here, in one place.
public final class GameConstants {
    public static final int DEFAULT_HEALTH = 100;
    public static final int WARRIOR_DAMAGE = 25;
    public static final int MAGE_DAMAGE = 40;

    private GameConstants() {
        // utility class, should not be instantiated
    }
}
