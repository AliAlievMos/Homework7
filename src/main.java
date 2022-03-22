
public class main {
    public static void main(String[] args){
//         Задание 1
        String a = "1";
        int b = 0;
        char b1 = 1;

        math math1 = new math<>(a,b);
        math1.add(a,b);
        math1.divide(a,b);
        math1.deduct(a,b);
        math1.multiply(a,b);

//          Задание 2

        user user1 = new user(a,b1);

//          Задание 3


        Integer[] first = {1,2,3,4,56};
        String[] second = {"Ну", "И", "Лист"};
        randomList randomList1 = new randomList<>(first);
        randomList1.createRl(first);
        randomList randomList2 = new randomList<>(second);
        randomList1.createRl(second);






    }
}
