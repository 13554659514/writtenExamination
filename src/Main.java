import java.util.Scanner;

/**
 * 实现n的阶乘使用递归实现
 * 北大医信笔试题
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Integer value = getNMethod(num);
        System.out.println(value);
    }
    // 实现n的阶乘
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
