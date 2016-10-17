import java.util.ArrayList;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)


        //TODO: Loop through the array of Monsters, printing out something for each Monster


        Monster dragonA = new Dragon(25, 27);
        Monster dragonB = new Dragon(29, 22);
        Monster zombieA = new Zombie(17, 12);
        Monster zombieB = new Zombie(12, 13);
        Monster vampireA = new Vampire(13, 19);
        Monster vampireB = new Vampire(18, 18);
        Monster warewolfA = new Warewolf(22, 10);
        Monster warewolfB = new Warewolf(21, 12);

        ArrayList<Monster> monstersList = new ArrayList<Monster>();

        monstersList.add(dragonA);
        monstersList.add(dragonB);
        monstersList.add(zombieA);
        monstersList.add(zombieB);
        monstersList.add(vampireA);
        monstersList.add(vampireB);
        monstersList.add(warewolfA);
        monstersList.add(warewolfB);


        for (Monster monster : monstersList){
            System.out.println(monster.aboutMe());
        }



    }
}
