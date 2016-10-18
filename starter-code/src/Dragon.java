/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{

    public Dragon(int damage, int health) {
        super(damage, health);
    }

    @Override
    public String aboutMe() {
        String  aboutMe = "The dragon has an attack point of " + getDamage() + " and a health point of "
                + getHealth() +".";
    return aboutMe;
    }
}