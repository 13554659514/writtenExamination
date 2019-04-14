import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by 14zr on 2019-04-12.
 * 古典问题图兔子
 * 有一对兔子，从第三个月起每个月都生一个兔子
 * 小兔子涨到第三个月之后，每个月会生成一个兔子
 * 假设兔子不死，每个月的兔子的总数是多少
 */
public class Rabbit {
     public static void main(String args[]){
         System.out.println("第一个月的兔子为:" +1);
         System.out.println("第一个月的兔子为:" +1);
         int M = 24 , f1 = 1 , f2 = 1, f;
         for (int i = 3; i <= M; i++) {
             f = f1;
             f2 = f1 + f2;  // 每个月的生的兔子
             f1 = f; // 之前的兔子
             System.out.println("第"+i+"个月的兔子的对数:" + f2);
         }
     }
}
