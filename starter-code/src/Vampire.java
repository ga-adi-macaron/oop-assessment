/**
 * Created by colinbradley on 10/15/16.
 */

public class Vampire extends Monster {

    @Override
    public String aboutMe() {
        return "I am a VAMPIRE with " + getmHealthPoints() + " HP and deal " + getmDamagePoints() + "damage";
    }

    public Vampire(int health, int damage) {
        super(health, damage);
    }


}
