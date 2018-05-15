package massivi;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Massivi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("enter masive numbers: ");
        Scanner scan = new Scanner(System.in);
        int n = 3;
        int[] Bibo = new int[n];
        int maxElement;
        maxElement = Bibo[0];
        for (int i = 0; i < Bibo.length; i++) {
            Bibo[i] = scan.nextInt();
        }

        for (int i = 0; i < Bibo.length; i++) {
            if (maxElement < Bibo[i]) {
                maxElement = Bibo[i];

            }

        }
        System.out.print("max element is: ");
        System.out.println(maxElement);
        int[] reversed = new int[Bibo.length];
        for (int i = 0; i < Bibo.length; i++) {
            reversed[i] = Bibo[Bibo.length - 1 - i];
            System.out.println(reversed[i]);

        }
        System.out.println(Arrays.toString(Bibo));
        System.out.println(Arrays.toString(reversed));
        // TODO code application logic here
    }

}
