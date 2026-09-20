# Game Character Factories — Factory Method & Abstract Factory

Simple game-character themed project for Assignment #2.

## How to run

```
javac -d out $(find src -name "*.java")
java -cp out factorymethod.FactoryMethodDemo
java -cp out abstractfactory.AbstractFactoryDemo
```

## Part A — Factory Method (`src/factorymethod`)

`GameCharacter` is the product interface, `Warrior` and `Mage` are concrete
products. `CharacterFactory` declares the factory method
`createCharacter(name)`; `WarriorFactory` and `MageFactory` each decide which
concrete class to build. The client (`FactoryMethodDemo`) never writes
`new Warrior(...)` directly — it only talks to `CharacterFactory`.

## Part B — Abstract Factory (`src/abstractfactory`)

Extends the same idea to a **family** of two related products per faction:
a `Warrior` and a matching `Weapon`. `UnitFactory` is the abstract factory,
with `HumanUnitFactory` and `OrcUnitFactory` as concrete factories. Using one
factory guarantees the warrior and the weapon always belong to the same
faction — a Human never ends up holding an Orc axe.

## Clean Code principles applied

**1. Meaningful, intention-revealing names**
Before: `c.a();`
After: `warrior.attack();` — the method and variable names say exactly what
happens, no comment needed.

**2. Small methods, each doing one thing**
`spawnCharacter(name)` in `CharacterFactory` only creates a character and
prints one line — it does not also handle input validation or game logic.
Each `attack()` method does exactly one thing: print the attack message.

**3. Validated construction**
```java
public Warrior(String name, int health) {
    if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Warrior name cannot be empty");
    }
    if (health <= 0) {
        throw new IllegalArgumentException("Warrior health must be positive");
    }
    ...
}
```
Before this check existed, a caller could silently create a `Warrior` with an
empty name or negative health. Now the object refuses to exist in an invalid
state, and the error is caught immediately at creation time instead of much
later when `attack()` behaves strangely.

**4. No magic numbers/strings**
Before: `System.out.println(name + " swings a sword for 25 damage!");`
After: damage values live in `GameConstants` / `FactionConstants`
(`WARRIOR_DAMAGE`, `HUMAN_WEAPON_DAMAGE`, etc.), so balance changes happen in
one place instead of being scattered through the code as unexplained
numbers.

**5. Consistent formatting and small, focused classes**
Every class has one job: `HumanSword` only knows its name and damage,
`HumanUnitFactory` only knows how to build a Human warrior + weapon pair.
No class mixes creation logic with game logic, and formatting (braces,
indentation, `@Override`) is identical across every file.
