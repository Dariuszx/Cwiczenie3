

public class Main {

    public static void main( String[] args ) {

        PrzezWstawianie insort = new PrzezWstawianie();
        PrzezScalanie mergeSort = new PrzezScalanie();

        double[] tablica = RandomArray.generate( 1000 );
        double[] tablica1 = RandomArray.generate( 1000 );




        System.out.println( "Wynik sortowania przez wstawianie:" );
        insort.sort( tablica );
        RandomArray.print( tablica );

        System.out.println( );
        System.out.println( );


        System.out.println( "Wynik sortowania przez scalanie:" );
        mergeSort.sort( tablica1 );
        RandomArray.print( tablica1 );

        RandomArray.print( tablica );




    }
}
