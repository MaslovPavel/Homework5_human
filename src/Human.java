import java.util.Calendar;
import java.util.Date;

public class Human implements  Comparable<Human> {

    String name;
    Calendar birthday;
    int passportNum;


    public Human(String name, Calendar birthday, int passportNum) {
        this.name = name;
        this.birthday = birthday;
        this.passportNum = passportNum;
    }

    public int compareTo(Human somebody) {
        int res = this.birthday.compareTo(somebody.birthday);
        if (res == 0){
            if (this.passportNum < somebody.passportNum){
                res = -1;
            } else {
                if (this.passportNum > somebody.passportNum) {
                    res = 1;
                }
            }
        }
        return res;
    }
}
