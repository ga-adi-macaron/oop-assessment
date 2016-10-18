/**
 * Created by NikitaShuvalov on 10/16/16.
 */

public class Elemental extends Monster {
    private String name = "Elemental";

    public Elemental(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public String aboutMe() {
        return String.format("I am an %s with %s health and %s attack power", name, getHP(), getAttack());
    }

    public String getName(){
        return name;
    }

}
