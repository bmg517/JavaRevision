import java.util.Scanner;
public class v04_Exercise01 {
    public static void main(String[] args){
        // 1. Calculate Percentage Of 5 Subject And Taking Input From User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Mark Of Hindi");
        float a = sc.nextInt();
        System.out.println("Enter The Mark Of English");
        float b = sc.nextInt();
        System.out.println("Enter The Mark Of Science");
        float c = sc.nextInt();
        System.out.println("Enter The Mark Of Math");
        float d = sc.nextInt();
        System.out.println("Enter The Mark of sst");
        float e = sc.nextInt();
        float sum = (a+b+c+d+e)/500*100;
        System.out.println(sum);


    }
}
