/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        Monster[] monsters = new Monster[5];
        monsters[0] = new Zombie(5, 10);
        monsters[1] = new Dragon(2, 12);
        monsters[2] = new Dragon(15, 100);
        monsters[3] = new Dragon(1, 2);
        monsters[4] = new Zombie(18, 1);
        for (Monster mon : monsters) {
            System.out.println(mon.aboutMe());
        }
    }
}
