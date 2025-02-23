public class v19_Method_In_Java {
    static int logic(int a, int b){
        int c;
        if(a>b){
            c =a+b;
        }else{
            c= (a+b)*5;
        }
        return c;

    }
    public static void main(String[]args){
        int a =10;
        int b=4;
        int c;
        c = logic(a, b);
        System.out.println(c);
    
        
    }
}
