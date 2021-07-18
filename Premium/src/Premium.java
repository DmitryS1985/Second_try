import java.util.Scanner;
public class Premium {
    public static void main(String[] args) {
        int num;
        int sal =100;
        float prem;
        System.out.println("VVedite staz rabotnika :");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("VVedite zarplatu rabotnika :");
        sal = input.nextInt();
        if (num < 5)
            System.out.println("premija + 10% :" + (prem =(float)sal * 10/100) + "evro");
            if (num >=5 && num <=10)
                System.out.println("premija + 15% :" + (prem =(float)sal * 15/100) + "evro");
                if (num >= 25)
                    System.out.println("premija + 50% :" + (prem =(float)sal * 150/100) + "evro");
                else
                    System.out.println("net takih rabotnikov");

    }
}
