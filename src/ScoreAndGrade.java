import java.util.Scanner;

/**
 * Created by 14zr on 2019-04-14.
 * 三木运算符的使用
 */
public class ScoreAndGrade {
    public static void main(String [] args) {
        int x ;
        char grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个成绩:");
        x = scanner.nextInt();
        grade = x>90?'A':x>=60?'B':'C';
        System.out.println("成绩等级:"+ grade);
    }
}
