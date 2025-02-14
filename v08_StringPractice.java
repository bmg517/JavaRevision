public class v08_StringPractice {
    public static void main(String[]args){
        // Q1. To Convert String Into Lowercase
        String name = "BharatMohanGUpta";
        System.out.println(name.toLowerCase());

        // Q2. Replace Space With Underscore
        String name1 = "Bharat MohanGupta";
        System.out.println(name1.replace(' ' ,'_'));

        //Q3. To Fill Letter Template letter = "Dear <|name|> , Thanks A Lots"
        String letter = "Dear <|name2|>,Thanks A Lots";
        System.out.println(letter.replace("<|name2|>", "Bhara Gupta"));

        //Q4. Detect Double And Triple Space In A String
        String name3 = "Pallu  MOhan   Gupta";
        System.out.println(name3.indexOf("  "));    // Double Space
        System.out.println(name3.indexOf("   "));   // Triple Space

        //Q5. Format Following Letter Using Space Sequence In String
        // letter = "Dear Man, You Are Great. Thanks"
        String letter1 = "Dear Man, \nYou Are Great. \nThanks";
        System.out.println(letter1);


    }
}
