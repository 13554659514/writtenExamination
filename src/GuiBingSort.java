import java.util.Arrays;

/**
 * Created by 14zr on 2019-04-15.
 * 将两个数组合并成一个数组然后排序
 */
public class GuiBingSort {
     public static void main(String args[]){
         int [] arr1 = {1,2,4,2,45,6,3};
         int [] arr2 = {56,5,4,2,25,6,3};
         int len = arr1.length + arr2.length;
         int [] c = new  int[len];
         for (int i = 0; i < arr1.length; i++) {
             c [i] = arr1[i];
         }
         for (int j = 0 ; j < arr2.length; j++) {
             c[arr1.length+j] = arr2[j];
         }
         Arrays.sort(c);
         System.out.println(Arrays.toString(c));
     }

}
