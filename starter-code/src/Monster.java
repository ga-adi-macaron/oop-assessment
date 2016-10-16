/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    private int mHP;
    private int mAttPow;

    public Monster(int hp, int damage) {
        mHP = hp;
        mAttPow = damage;
    }

    public int getHP() {
        return mHP;
    }

    public void setHP(int hp) {
        mHP = hp;
    }

    public int getAttack() {
        return mAttPow;
    }

    public void setAttack(int attack) {
        mAttPow = attack;
    }

    public void takeDamage(int damage){
        mHP-=damage;
    }

    public abstract String aboutMe();
    public abstract String getName();
}
