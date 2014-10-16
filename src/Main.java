
public class Main {

    public static void main( String[] args ) {

        PrzezWstawianie insort = new PrzezWstawianie();
        PrzezScalanie mergeSort = new PrzezScalanie();

        double[] tablica = RandomArray.generate( 5 );

        RandomArray.print( tablica );

        mergeSort.sort( tablica );
        //insort.sort( tablica );

        RandomArray.print( tablica );




    }
}
