/**
 * Created by colinbradley on 10/15/16.
 */

public class Warewolf extends Monster {
    @Override
    public String aboutMe() {
        return "I am a WAREWOLF with " + getmHealthPoints() + " HP and deal " + getmDamagePoints() + "damage";
    }

    public Warewolf(int health, int damage) {
        super(health, damage);
    }
}
