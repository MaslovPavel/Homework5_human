import java.util.Calendar;
import java.util.Date;

public class Human implements  Comparable<Human> {

    private String name;
    private final Calendar birthday;
    private int passportNum;


    public String getName() {
        return name;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public String getBirthday() {
        String birthday = this.birthday.get(1) + "." + this.birthday.get(2) + "." + this.birthday.get(3);
        return birthday;
    }

    public Human(String name, Calendar birthday, int passportNum) {
        this.name = name;
        this.birthday = birthday;
        this.passportNum = passportNum;
    }

    public int compareTo(Human somebody) {
        int res = this.birthday.compareTo(somebody.birthday);
        if (res == 0) {
            if (this.passportNum < somebody.passportNum) {
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
