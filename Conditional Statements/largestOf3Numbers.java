import java.util.*;
public class largestOf3Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    if (A > B && A > C){
      System.out.println("The greater number is A");
    }

    else if (B > C){
      System.out.println("The greater number is B");
    }
    
    else{
      System.out.println("The greater number is C");
    }
  }
}

