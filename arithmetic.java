import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coefficients");

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("The roots are " +r1+ " and " +r2);
        sc.close();
    }
}