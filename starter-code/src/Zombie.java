/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{
    private int mNumOfLimbs;

    public Zombie(int damage, int health) {
        super(damage, health);
        mNumOfLimbs = 3;
    }

    public int getNumOfLimbs() {
        return mNumOfLimbs;
    }

    public void setNumOfLimbs(int numOfLimbs) {
        mNumOfLimbs = numOfLimbs;
    }

    @Override
    public String aboutMe() {
        return "I am a Zombie with "+ getHealth() + "Health and does "+ getDamage() +" damage! But only have "+mNumOfLimbs+" limbs...";
    }
}
