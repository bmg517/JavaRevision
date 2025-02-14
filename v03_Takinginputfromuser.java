import java.util.Scanner;
public class v03_Takinginputfromuser {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        float a = sc.nextFloat(); 
        // int a = sc.nextInt();   For Float Value
        System.out.println("Enter The Second Number");
        float b = sc.nextFloat();
        // int b = sc.nextInt();
        System.out.println("Enter The Third Number");
        float c = sc.nextFloat();
        // int c = sc.nextInt();
        System.out.println("Sum Of The Number is : ");
        float sum = a+b+c;
        // int sum = a+b+c;
        System.out.println(sum);
        
        // For String Value
        // String str = sc.next();  For Single Word
        // String str = sc.nextLine();
        // System.out.println(str);

        // boolean b1 = sc.hasNextInt();    For Checking Boolean Value
        // System.out.println(b1);


    }
}