import org.jfree.ui.RefineryUtilities;

public class Main {

    public static void main( String[] args ) {


        Testowanie testowanie = new Testowanie( 10, 50, 100);

        Wykres wykres = new Wykres( "test", testowanie );
        wykres.pack();
        RefineryUtilities.centerFrameOnScreen(wykres);
        wykres.setVisible(true);

        /*
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


*/

    }
}
