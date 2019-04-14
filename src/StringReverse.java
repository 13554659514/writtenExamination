/**
 * Created by 14zr on 2019-04-14.
 * 有一个字符串"123ABC",如能输出成"CBA321"
 */
public class StringReverse {
     public static void main(String args[]){
         String str1 = "123ABC";
         StringBuffer stringBuffer = new StringBuffer(str1);
         stringBuffer.reverse();
         System.out.println(stringBuffer);
     }
}
