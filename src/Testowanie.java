import java.util.ArrayList;

class Czas {

    public int czas;
    public int iloscElementow;

    public Czas( int czas, int iloscElementow ) {

        this.czas = czas;
        this.iloscElementow = iloscElementow;
    }

}

class SingleTest {

    public Czas przezScalanie;
    public Czas przezWstawianie;

    public SingleTest( Czas w, Czas s ) {

        przezScalanie = s;
        przezWstawianie = w;
    }
}


public class Testowanie {

    public ArrayList<SingleTest> tablica;
    private int skok;
    public int iloscTestow;
    private int poczatkowaWielkosc;


    public Testowanie( int poczatkowaWielkosc, int skok, int iloscTestow ) {

        tablica = new ArrayList<SingleTest>();
        this.skok = skok;
        this.iloscTestow = iloscTestow;
        this.poczatkowaWielkosc = poczatkowaWielkosc;

        testuj();

    }

    private void testuj() {

        PrzezWstawianie przezWstawianie = new PrzezWstawianie();
        PrzezScalanie przezScalanie = new PrzezScalanie();

        for( int i =0; i < iloscTestow; i++ ) {

            int size = poczatkowaWielkosc + skok * i;
            double[] tablica1 = RandomArray.generate( size );
            double[] tablica2 = RandomArray.generate( size );

            przezWstawianie.sort( tablica1 );
            przezScalanie.sort( tablica2 );

            tablica.add( new SingleTest( new Czas( przezWstawianie.czas, size ), new Czas( przezScalanie.czas, size ) ) );

        }
    }


}
