public class v16_Array {
    public static void main(String args[]){

        // 1.Int Value

        int [] marks = {100,90,80,70,60};
        // System.out.println(marks.length);

        // 2.Float Value

        // float [] marks1 = {100.5f,90.5f,80.5f,70.5f,60.5f,50.5f};
        // System.out.println(marks1.length);
        // System.out.println(marks1[1]);
        
        // 3. String Value

        // String [] name = {"Bharat","Arun","Lalit","Shubham"};
        // System.out.println(name.length);
        // System.out.println(name[0]);
        // System.out.println(name[1]);
        // System.out.println(name[2]);

        // Displaying Array By Using For Loop

        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }


        // Displaying Arrays In Reverse ways

    //     System.out.println("Printing In Reverse Way");
    //     System.out.println(marks.length);
    //     for(int i=marks.length -1; i>=0; i--){
    //         System.out.println(marks[i]);
    // }

        // For Each-Loop In Java

        System.out.println("Using For-Loop In Array ");
        for(int element: marks){
            System.out.println(element);
        }
    
    
    }  
}
