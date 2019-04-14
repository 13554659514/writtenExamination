/**
 * Created by 14zr on 2019-04-14.
 * 菱形和空心菱形
 */
public class Lingxing {
     public static void main(String args[]){
         lingxing();
         kongxinlingxing();
     }
    public static void lingxing() {
        int num = 5;
        for (int i = 1; i <= num -1; i++) {
            for (int j = 1; j< num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i<= num -1; i++) {
            for (int j =1; j<= i-1; j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2*(i-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void kongxinlingxing() {
        int num = 5;
        for (int i = 1; i <= num -1; i++) {
            for (int j = 1; j< num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1; k++) {
                if (k==1 || k== 2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i<= num -1; i++) {
            for (int j =1; j<= i-1; j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2*(i-1); k++) {
                if (k==1 || k == 7 - 2*(i-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }
    }
}
