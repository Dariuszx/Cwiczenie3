import java.util.Random;

public class RandomArray {

    public static double[] generate( int size ) {

        Random random = new Random();
        double[] tablica = new double[size];
        int i =0;

        for( i = 0; i < size; i++ ) {
            tablica[i] = random.nextDouble() * 100;
        }

        return tablica;
    }

    public static void print( double[] tablica ) {

        for( int i=0; i < tablica.length; i++ ) {
            System.out.print( tablica[i] + " ");
        }

        System.out.println();
    }
}
