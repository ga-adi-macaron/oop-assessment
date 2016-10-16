import java.util.Random;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        Random ranGen= new Random();

        monsters[0]=new Zombie(15,3);
        monsters[1]=new Elemental(23,4);
        monsters[2]=new Dragon(35,7);
        for (Monster monster:monsters) {
            System.out.println(monster.aboutMe());
        }
        System.out.println("---Attack---");
        for(Monster monster:monsters){
            int x = ranGen.nextInt(3);
            Monster attacker = monsters[x];
            while (attacker.equals(monster)){
                x = ranGen.nextInt(3);
                attacker = monsters[x];
            }
            monster.takeDamage(attacker.getAttack());
            System.out.println(String.format("%s attacked %s for %s damage.", attacker.getName(),monster.getName(), String.valueOf(attacker.getAttack())));
        }
        System.out.println("---Aftermath---");
        for (Monster monster:monsters) {
            System.out.println(monster.aboutMe());
        }

        //TODO: Loop through the array of Monsters, printing out something for each Monster

    }
}
