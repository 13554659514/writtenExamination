/**
 * Created by 14zr on 2019-04-10.
 * ���⣺ "abcbcafdrfdf"
 * 1.�ҵ���һ��ֻ����һ�ε��ַ���
 * 2.�ҵ�ֻ����һ�ε����е��ַ���
 * �������ü���
 */
public class OnlyChar {
     public static void main(String args[]){
         // �ҵ����е�ֻ����һ�ε��ַ���
         returnChar();
         // �ҵ�ֻ����һ�εĵ�һ�����ַ���
         returnOnlyChar();
     }

    /**
     * �ҵ����е�ֻ����һ�ε��ַ���
     * ʵ��˼·,��ȡ��ǰ���ַ�,
     * ���ݵ�ǰ�ַ���ȥ���˵�ǰ���ַ����ַ����в���
     * �Ƿ񻹴��ڵ�ǰ�ַ�
     * �����������׷��
     */
    public static void returnChar() {
        String str = "abbcddcfgfla";
        StringBuffer c = new StringBuffer();
        for (int i = 0 ; i < str.length(); i++) {
            // ȥ����ǰ���ַ�
            String temp = str.substring(0,i) + str.substring(i+1);
            // ���ݵ�ǰ���ַ�ȥ�µ��ַ��в����Ƿ��и��ַ���
            int index = temp.indexOf(str.charAt(i));
            if (index == -1) {
                c .append(str.valueOf(str.charAt(i)));
            }
        }
        System.out.println(c);
    }

    /**
     * �ҵ�ֻ����һ�εĵ�һ���ַ���
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
