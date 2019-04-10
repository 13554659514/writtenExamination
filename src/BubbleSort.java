import java.util.Arrays;

/**
 * Created by 14zr on 2019-04-10.
 * 冒泡排序
 * N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次
 * 每进行一趟排序，就会少比较一次，因为每进行一趟排序都会找出一个较大值。
 */
public class BubbleSort {
     public static void main(String args[]){
         int [] num = {1,34,3,65,11,45,21};
         for (int i = 0; i<num.length-1; i++) {
             for (int j = 0; j < num.length-1-i; j++) {
                 if (num[j] > num[j+1]) {
                     int temp = num[j] ;
                     num[j] = num[j+1];
                     num[j+1] = temp;
                 }
             }
         }
         System.out.println(Arrays.toString(num));
     }
}
