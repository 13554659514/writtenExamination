/**
 * Created by 14zr on 2019-04-10.
 * 如题： "abcbcafdrfdf"
 * 1.找到第一个只出现一次的字符串
 * 2.找到只出现一次的所有的字符串
 * 西安京颐集团
 */
public class OnlyChar {
     public static void main(String args[]){
         // 找到所有的只出现一次的字符串
         returnChar();
         // 找到只出现一次的第一个的字符串
         returnOnlyChar();
     }

    /**
     * 找到所有的只出现一次的字符串
     * 实现思路,获取当前的字符,
     * 根据当前字符到去除了当前的字符的字符串中查找
     * 是否还存在当前字符
     * 不存在则进行追加
     */
    public static void returnChar() {
        String str = "abbcddcfgfla";
        StringBuffer c = new StringBuffer();
        for (int i = 0 ; i < str.length(); i++) {
            // 去除当前的字符
            String temp = str.substring(0,i) + str.substring(i+1);
            // 根据当前的字符去新的字符中查找是否还有该字符串
            int index = temp.indexOf(str.charAt(i));
            if (index == -1) {
                c .append(str.valueOf(str.charAt(i)));
            }
        }
        System.out.println(c);
    }

    /**
     * 找到只出现一次的第一个字符串
     */
    public static void returnOnlyChar() {
        String str = "abbcddcfgfl";
        String c = "";
        for (int i = 0 ; i < str.length(); i++) {
            String temp = str.substring(0,i) + str.substring(i+1);
            int index = temp.indexOf(str.charAt(i));
            if (index == -1) {
                c = str.valueOf(str.charAt(i));
                break;
            }
        }
        System.out.println(c);
    }
}
