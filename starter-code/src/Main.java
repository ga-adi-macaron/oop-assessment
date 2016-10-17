import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)

        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Monster dragon1 = new Dragon(15, 14);
        Monster dragon2 = new Dragon(23, 39);
        Monster skeleton = new Skeleton(12, 10);
        Monster zombie1 = new Zombie(9, 6);
        Monster zombie2 = new Zombie(7, 10);

        monsters.add(dragon1);
        monsters.add(dragon2);
        monsters.add(skeleton);
        monsters.add(zombie1);
        monsters.add(zombie2);

        Collections.shuffle(monsters);

        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for(Monster monster : monsters){
            System.out.println(monster.aboutMe());
        }

    }
}
