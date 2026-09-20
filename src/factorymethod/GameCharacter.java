package factorymethod;

// Abstract product: every character type must be able to attack and describe itself.
public interface GameCharacter {
    void attack();

    String describe();
}
