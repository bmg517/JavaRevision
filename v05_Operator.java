public class v05_Operator {
    public static void main(String[]arhs){
    // 1. Arthmetic Operator (+,-,*,/,%,++,--)

        int a = 4;
        int b = 9 % a; // Modulo Operator Which Show Remainder
        System.out.println(b);

    // 2. Assingement Operator(== ,+=,-=)
        
        a +=4;
        System.out.println(a);

    // 3. Comparison Operator(==,>=,<=)

        System.out.println(9==9);
        System.out.println(64>3);
        System.out.println(88<19);

    // 4. Logical Operator( &&(And), ||(OR) ,!(NOT)) 
        
        System.out.println(77>2 && 88>77);   // And Operator
        System.out.println(77>2 && 88>97);

        System.out.println(77>2 || 88>97);  //  OR

        

        
    
    }
}
