import java.util.ArrayList;
import java.util.List;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)

        Monster zombie = new Zombie(10, 4);
        Monster dragon = new Dragon(8, 3);

        List<Monster> monsters = new ArrayList<Monster>();
        monsters.add(zombie);
        monsters.add(dragon);

        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (Monster monster : monsters) {
            monster.aboutMe();
        }
    }
}
