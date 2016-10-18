/**
 * Created by Serkan on 16/10/16.
 */
public class Squirrel extends Monster {
    public Squirrel(int damage, int health) {
        super(damage, health);
    }

    @Override
    public String aboutMe() {
        String  aboutMe = "The squirrel has an attack point of " + getDamage() + " and a health point of "
                + getHealth() +".";
        return aboutMe;    }
}
