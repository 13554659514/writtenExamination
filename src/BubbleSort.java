import java.util.Arrays;

/**
 * Created by 14zr on 2019-04-10.
 * ð������
 * N������Ҫ������ɣ��ܹ�����N-1������ÿi�˵��������Ϊ(N-i)��
 * ÿ����һ�����򣬾ͻ��ٱȽ�һ�Σ���Ϊÿ����һ�����򶼻��ҳ�һ���ϴ�ֵ��
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
