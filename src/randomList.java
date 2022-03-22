
import java.util.ArrayList;
import java.util.List;


public class randomList<N> {
    private N[] list;
    randomList(N[] list){
        this.list = list;
    }


    public void createRl(N[] list) {
        ArrayList rl = new ArrayList<>();

        List list1 = List.of(list);
        int a = list1.size();


        for (int i = 0; i < 100; i++) {
            rl.add(list1.get((int) (Math.random() * a)));
            i++;
        }
        System.out.println(rl);


    }
}