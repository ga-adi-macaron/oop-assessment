/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables
    private int mDamage;
    private int mHealth;

    public Monster(int damage, int health) {
        mDamage = damage;
        mHealth = health;
    }

    public int getDamage() {
        return mDamage;
    }

    public int getHealth() {
        return mHealth;
    }

    public abstract String aboutMe();
}