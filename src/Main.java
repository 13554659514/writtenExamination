import java.util.Scanner;

/**
 * ʵ��n�Ľ׳�ʹ�õݹ�ʵ��
 * ����ҽ�ű�����
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Integer value = getNMethod(num);
        System.out.println(value);
    }
    // ʵ��n�Ľ׳�
    public  static Integer getNMethod(Integer n) {
        if (n < 0) {
            return null;
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return n*getNMethod(n-1);
    }
}
