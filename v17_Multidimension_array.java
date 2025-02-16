public class v17_Multidimension_array {
    public static void main(String[]args){
    // Multidimensional Array is a Array Of Array
    int [][] flats;
    flats = new int[2][3];
    flats [0][0] = 100;
    flats [0][1] = 101;
    flats [0][2] = 102;

    flats [1][0] = 201;
    flats [1][1] = 202;
    flats [1][2] = 203;

    for(int i=0; i<flats.length; i++){
        for(int j =0; j<flats[i].length; j++) {
        System.out.println(flats[i][j]);
        }
        
    }

    }
}
