/**
 * The Character class represents a character in a video game. Characters have
 * names, character types (such as wizard, orc, thief, spy, etc), health, and
 * power. Power is the amount of damage a character deals when they attack
 * another Character.
 * <p>
 * Your job is to add these four properties to this class, along with a
 * constructor to setup the Character's initial state. You will also need to add
 * an attack() method so that a Character may attack and deal damage to another
 * character. Finally, you will override the toString() method so that object
 * can describe itself.
 * <p>
 * Follow the instructions in the to-do items listed below.
 */
public class Character {

    // todo: Create a property to hold the character's name
    public String name;

    // todo: Create a property to hold the character's type. This will be free-form text.
    public String type;

    // todo: create a property to hold the character's health. This should be a double value.
    public double health;

    // todo: Create a property to hold the character's power. This should be a double value.
    public double power;
    // todo: Create a constructor that accepts and sets the default values for the name, type, health, and power properties. Note that the order specified is required for tests to pass.

    public Character(String charName, String charType, double charHealth, double charPower) {
        this.name = charName;
        this.type = charType;
        this.health = charHealth;
        this.power = charPower;
    }


    // todo: Create a method named 'attack'. This method should accept a Character that will be attacked by this character.
    public void attack(Character name) {
        // todo: Update the character that was passed into the attack() method by decreasing its health by this character's power.
        name.health = name.health - this.power;

    }


    // todo: Override the default toString() method. This method should return a String that reads "The <type> <name> has <health> health and deals <power> damage on each attack."

    @Override
    public String toString() {
        return "The " + this.type + " " + this.name + " " + "has " + this.health + " health and deals " + this.power + " damage on each attack.";

    /*
        As an example for this to-do, a wizard named Lisa with health of 100 and
        power of 23 would output "The wizard Lisa has 100.0 health and deals 23
        damage on each attack."
     */
    }
}
