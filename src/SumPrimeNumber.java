/**
 * Created by 14zr on 2019-04-10.
 * ͳ��1��100�������� �Լ����������е�ֵ
 */
public class SumPrimeNumber {
     public static void main(String args[]){
         returnValue();
     }
    public static void returnValue() {
        int sum = 0 ;
        int j;
        int count = 0;
        for (int i = 2 ; i <= 100 ; i++) {
            for ( j = 2 ; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j >= i) {
               sum += j;
               count += 1;
                System.out.println(j);
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
