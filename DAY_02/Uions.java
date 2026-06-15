import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

public class Uions {
     public static void main(String[] args) {
         int a[]={2,3,4,5,6,7};
         int b[]={3,6,8,9,5,1,11};
        HashSet<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
                 set.add(num);
        }
        for(int num:set){
            System.out.println(num);
        }
     }
}
