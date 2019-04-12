/**
 * Created by 14zr on 2019-04-12.
 * 水仙花数
 */
public class Narcissistic {
     public static void main(String args[]){
         for (int i = 100; i<1000; i++) {
             int a = i/100; // 除以100 求出百位
             int b = i/10%10; // 首先除10 得到百位和十位，然后取余求出十位
             int c = i%10; // 对10取余，求出个位
             if (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3) == i) {
                 System.out.println(i+"是水仙花数");
             }
         }
     }
}
