/**
 * Created by Scott Lindley on 10/15/2016.
 */
public class Skeleton extends Monster{

    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String aboutMe() {
        return "I am a Skeleton with "+getHealth()+" health and "+getDamage()+" damage!";
    }
}
