package factorymethod;

// Creator. Declares the factory method and one small helper method that uses it.
// Subclasses decide WHICH character gets created; this class does not know or care.
public abstract class CharacterFactory {

    // The factory method itself.
    protected abstract GameCharacter createCharacter(String name);

    // Clean Code: small method, does one thing - creates a character and announces it.
    public GameCharacter spawnCharacter(String name) {
        GameCharacter character = createCharacter(name);
        System.out.println(character.describe() + " has entered the battlefield.");
        return character;
    }
}
