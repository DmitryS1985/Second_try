import java.util.Scanner;

public class PowerOfTwo {

public static void main(String[] args) {
    int  num;
    System.out.println("vedite cislo : ");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 5 == 0 && num % 2 == 0)
        System.out.println("cislo delitsja na 5 i 2 i ravno :" + (num = num /2) );

    else System.out.println("nifiga");



}
}
