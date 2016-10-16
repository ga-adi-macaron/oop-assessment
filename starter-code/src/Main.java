/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)

        Dragon jeff = new Dragon(12, 16);
        Dragon roger = new Dragon(9, 19);
        Dragon gertrude = new Dragon(11, 17);
        Zombie rob = new Zombie(5, 3);

        Monster[] monsters = {jeff, roger, gertrude, rob};

        //TODO: Loop through the array of Monsters, printing out something for each Monster

        for (Monster monster : monsters) {
            System.out.println(monster.aboutMe());
        }


    }
}
