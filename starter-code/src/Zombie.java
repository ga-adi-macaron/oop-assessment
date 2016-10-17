/**
 * Created by drewmahrt on 4/27/16.
 */


public class Zombie extends Monster{

    public Zombie(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        return "I am a Zombie with " + this.getHealth() + " health and do " + this.getDamage() + " damage!";
    }
}
