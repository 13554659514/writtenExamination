/**
 * Created by 14zr on 2019-04-10.
 * ����str2��str1�е�һ�γ��ֵ�λ��
 */
public class ExistString {
     public static void main(String args[]){
         String str1 = "abcacdff";
         String str2 = "acf";
         Integer value = str1.indexOf(str2);
         System.out.println(value);
     }
}
