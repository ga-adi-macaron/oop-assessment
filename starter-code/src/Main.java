import java.lang.reflect.Array;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)

        Dragon hellkite = new Dragon(7, 15);
        Dragon kalameet = new Dragon(15, 35);
        Zombie pussofman = new Zombie(2,4);
        Zombie hollow = new Zombie(1, 3);

        Monster[] monsters = {hellkite, kalameet, pussofman, hollow};



        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (Monster monster : monsters) {
            System.out.println(monster.aboutMe());
        }

    }
}
