package factorymethod;

public class WarriorFactory extends CharacterFactory {
    @Override
    protected GameCharacter createCharacter(String name) {
        return new Warrior(name, GameConstants.DEFAULT_HEALTH);
    }
}
