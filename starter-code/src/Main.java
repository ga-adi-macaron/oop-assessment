/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        List <Monster> monsterList = new ArrayList<>();

        Dragon dragon = new Dragon ();
        Zombie zombie = new Zombie ();

        monsterList.add(dragon);
        monsterList.add(zombie);


        //TODO: Loop through the array of Monsters, printing out something for each Monster
        for (int i = 0; i < monsterList.size() ; i++) {
            System.out.println(monsterList.get(i).aboutMe());
        }
    }
}
