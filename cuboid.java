import java.util.Scanner;

public class cuboid {
  public static void main(String[] args) {
    float a, b, c, volume, totalArea;
    System.out.println("Enter the sides of the cuboid");
    Scanner sc = new Scanner(System.in);
    a = sc.nextFloat();
    b = sc.nextFloat();
    c = sc.nextFloat();
    volume = a*b*c;
    totalArea = 2*(a*b + b*c + a*c);

    System.out.println("The volume of the cuboid is"+ volume);
    System.out.println("The total area of the cuboid is" + totalArea);
    sc.close();
    
  }
}
