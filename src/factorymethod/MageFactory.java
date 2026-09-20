package factorymethod;

public class MageFactory extends CharacterFactory {
    @Override
    protected GameCharacter createCharacter(String name) {
        return new Mage(name, GameConstants.DEFAULT_HEALTH);
    }
}
