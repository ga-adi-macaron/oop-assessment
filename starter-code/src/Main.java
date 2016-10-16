import java.util.ArrayList;
import java.util.List;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        Monster dragon = new Dragon(4,10);
        Monster zombie = new Zombie(1,2);
        Monster squirrel = new Squirrel(100,150);

        List<Monster> monsters = new ArrayList<Monster>();
        monsters.add(dragon);
        monsters.add(zombie);
        monsters.add(squirrel);
        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(monsters.get(i).aboutMe());
        }
    }
}