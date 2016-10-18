/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{
    private String name = "Dragon";

    public Dragon(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public String aboutMe() {
        return String.format("I am a %s with %s health and %s attack power", name, getHP(), getAttack());
    }
    public String getName() {
        return name;
    }
}
