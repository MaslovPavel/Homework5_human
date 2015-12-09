public class PrintHumanArr {
    public static void printHumanArr(Human[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.format(arr[i].getName() + "  " + arr[i].getBirthday() + "  " + "%d\n", arr[i].getPassportNum());
        }
        System.out.println("-----------------------------");
    }
}
