import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;


public class HumanSort {
    public static void main(String[] args) {

        Human[] humans = new Human[5];
        humans[0] = new Human("David", new GregorianCalendar(1960, 2, 14), 196542);
        humans[1] = new Human("Carl", new GregorianCalendar(1995, 6, 30), 221341);
        humans[2] = new Human("Stenley", new GregorianCalendar(1983, 11, 3), 687418);
        humans[3] = new Human("Norton", new GregorianCalendar(1957, 3, 11), 349418);
        humans[4] = new Human("Cloe", new GregorianCalendar(2001, 1, 18), 306001);
        Arrays.sort(humans);
        PrintHumanArr.printHumanArr(humans);
        Arrays.sort(humans, new Comparator<Human>() {
            @Override
             public int compare(Human o1, Human o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        PrintHumanArr.printHumanArr(humans);
        Arrays.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        PrintHumanArr.printHumanArr(humans);

    }
}
