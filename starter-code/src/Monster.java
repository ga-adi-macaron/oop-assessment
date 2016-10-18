/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 
    private int health, damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public abstract String aboutMe();
}
