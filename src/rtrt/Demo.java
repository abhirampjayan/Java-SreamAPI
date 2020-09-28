package rtrt;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,5,4,7,8,9);
//        int result=0;
        /*for (int i:value
             ) {
            result=result+i*2;
        }*/

//        System.out.println(value.stream().map(i->i*2).reduce(0,(c,e)->c+e));

        /*Function<Integer,Integer> f=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer,Integer integer2) {
                return integer+integer2;
            }
        };
        Stream s=value.stream();
        Stream s1=s.map(f);
        Integer result=(Integer) s1.reduce(0,b);
        System.out.println(result);*/


        Stream<Integer> s=value.stream();
//        Stream<Integer> s1=s.map((integer) ->integer*2);
        Integer result=(Integer) s.map((integer) ->integer*2).reduce(0,(integer,integer2)->integer+integer2);
        System.out.println(result);
    }
}
