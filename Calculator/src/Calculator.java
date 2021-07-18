import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int  c;

        System.out.println("vvedite a :");
        a = sc.nextInt();
        System.out.println("vvedite b :");
         b = sc.nextInt();
        System.out.println("vvedite dejstvije");


        String x = sc.next();


        switch (x) {
            case "+": {
                c = a + b;
                System.out.println("umnozenije : " + c);
                break;
            }
            case "/": {
                c = a / b;
                System.out.println("delenije : " + c);
                     //if ( "/") (b = 0)) {
                     //System.out.println("oshibka");}
                break;
            }
            case "-": {
                c = a - b;
                System.out.println("vichitanije : " + c);
                break;
            }
            case "*": {
                c = a * b;
                System.out.println("umnozenije : " + c);
                break;
            }
        }
        }
    }

