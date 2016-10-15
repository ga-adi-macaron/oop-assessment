/**
 * Created by drewmahrt on 4/27/16.
 */


public class Dragon extends Monster{

    public Dragon(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        return "I am a Dragon with " + this.getHealth() + " health and do " + this.getDamage() + " damage!";
    }
}
