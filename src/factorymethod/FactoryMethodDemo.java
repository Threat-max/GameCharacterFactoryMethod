package factorymethod;

// Part A demo. The client only talks to CharacterFactory - it never
// writes "new Warrior(...)" or "new Mage(...)" directly.
public class FactoryMethodDemo {
    public static void main(String[] args) {
        CharacterFactory warriorFactory = new WarriorFactory();
        GameCharacter warrior = warriorFactory.spawnCharacter("Conan");
        warrior.attack();

        CharacterFactory mageFactory = new MageFactory();
        GameCharacter mage = mageFactory.spawnCharacter("Gandalf");
        mage.attack();
    }
}
