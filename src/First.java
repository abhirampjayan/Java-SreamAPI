import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;


public class First {
    public static void main(String[] args) {
        List<Integer> ar= Arrays.asList(1,5,8,9,7);
/*
        for (int i = 0; i <ar.toArray().length; i++) {
            System.out.println(ar.get(i));
        }
        for (Integer j:ar ) {
            System.out.println(j);
        }
        Iterator<Integer> k= ar.iterator();
        while (k.hasNext()){
            System.out.println(k.next());
        }
*/
        ar.forEach(i-> System.out.println(i));

    }
}
