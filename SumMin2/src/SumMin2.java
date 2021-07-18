import java.util.Scanner;

public class SumMin2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = 5;
        int b = 10;
        int s = 0;
        System.out.println("vvdite pervoje chislo : ");
//        a = input.nextInt();
        System.out.println("vvdite vtoroje chislo : ");
//        b = input.nextInt();
           for (int i = a; i <= b; i++) {
            s += i;
        }
        System.out.println("summa chisel mezdu a i b:" + s);
        System.out.print("chisla ne chetnije : ");
            for (int i = a; i <= b; i++) {
                if (i % 2 == 1) {
                System.out.print(i + ",");
            }

        }
    }
}