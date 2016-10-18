/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{
    private int health, damage;

    public Dragon(int health, int damage) {
        super(health,damage);
        this.health = health;
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Overide
    public String aboutMe () {
        return ("I'm a dragon with " + health + " health and I do " + damage + " damage!" );
    }
}
