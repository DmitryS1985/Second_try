import java.util.Scanner;

public class Practicswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("vvedite pogodu: ");
        String a = sc.next();

        switch (a) {
            case "windy" : {
                System.out.println("vetrenno");
                break;}
            case "sunny" : {
                System.out.println("solnechno");
                break;}
            case "rainy" : {
                System.out.println("dozdlivo");
                break;}
            case "cloudy" : {
                System.out.println("oblachno");
                break;}
            default : {
                System.out.println("net takoj pogodi");
            }
            }
        }


    }

