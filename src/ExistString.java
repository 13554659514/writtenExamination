/**
 * Created by 14zr on 2019-04-10.
 * 查找str2在str1中第一次出现的位置
 */
public class ExistString {
     public static void main(String args[]){
         String str1 = "abcacdff";
         String str2 = "acf";
         Integer value = str1.indexOf(str2);
         System.out.println(value);
     }
}
