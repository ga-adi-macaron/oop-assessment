/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{
    private int mNumberOfLegs;
    private String mName;

    public Dragon(String name, int damage, int health, int numberOfLegs) {
        super(damage, health);
        mNumberOfLegs = numberOfLegs;
        mName = name;
    }

    @Override
    public String aboutMe() {
        return "I'm the legendary dragon, "+ mName + ", with " + super.getHealth() + " health and do "+super.getDamage()+" damage!";
    }
}
