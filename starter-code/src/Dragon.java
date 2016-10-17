/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{

    public Dragon(int mHealth, int mDamage) {
        super(mHealth, mDamage);
    }

    @Override
    public String aboutMe() {
        return "I am an Undead Dragon with " + getHealth() + "HP, and I hit for " + getDamage() + " damage";

    }

}
