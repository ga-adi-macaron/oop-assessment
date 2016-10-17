/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{
    private int health, damage;

    public Zombie(int health, int damage) {
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
        return ("I'm a Zombie with " + health + " health and do " + damage " damage!");
    }
}
