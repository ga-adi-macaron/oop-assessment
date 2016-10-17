/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 


    private int mHealthPoints;
    private int mDamagePoints;


    public abstract String aboutMe();

    public Monster(int health, int damage){
        mDamagePoints = damage;
        mHealthPoints = health;
    }

    public int getmHealthPoints() {
        return mHealthPoints;
    }

    public int getmDamagePoints() {
        return mDamagePoints;
    }

    public void setmHealthPoints(int health) {
        mHealthPoints = health;
    }

    public void setmDamagePoints(int damage) {
        mDamagePoints = damage;
    }
}
