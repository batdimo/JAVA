/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

/**
 *
 * @author s504
 */
public class DES {
    static  int key[] = {0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1,
        0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 
        1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1};
   static int  permutedChoice1[] = {57, 49, 41, 33, 25, 17, 9,
                                                    1, 58, 50, 42, 34, 26, 18,
                                                   10, 2, 59, 51, 43, 35, 27,
                                                    19, 11, 3, 60, 52, 44, 36,
                                                    63, 55, 47, 39, 31, 23, 15,
                                                      7, 62, 54, 46, 38, 30, 22,
                                                    14, 6, 61, 53, 45, 37, 29,
                                                    21, 13, 5, 28, 20, 12, 4};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        print(key);
        permute(key, permutedChoice1, 56);
        print(key);
        // TODO code application logic here
    }
    
   static void  print(int arr[]) {
        int l = arr.length;
        for(int i = 0; i < 64; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    
   static void permute(int txt[], int perm[], int n){    //source to permute, permutation and number of symbols in the permutation

        int newTxt[] = new int[64]; //it is initialized with the maksimum possible numbers
        //int copyP[n];
        int i=0;


        for(i=0;i<n;i++){
                newTxt[i]=txt[perm[i]-1];
        }

        for(i=0;i<n;i++){
                txt[i]=newTxt[i];
        }


}

}
