import java.util.ArrayList;

class Czas {

    public int czas;
    public int iloscElementow;

}

class SingleTest {

    public Czas przezScalanie;
    public Czas przezWstawianie;
}


public class Testowanie {

    public ArrayList<SingleTest> tablica;
    private int skok;
    private int iloscTestow;
    private int poczatkowaWielkosc;


    public Testowanie( int poczatkowaWielkosc, int skok, int iloscTestow ) {

        tablica = new ArrayList<SingleTest>();
        this.skok = skok;
        this.iloscTestow = iloscTestow;
        this.poczatkowaWielkosc = poczatkowaWielkosc;

    }

    private void testuj() {

        for( int i =0; i < iloscTestow; i++ ) {

            double[] tablica = RandomArray.generate( poczatkowaWielkosc + skok * i );

            
        }
    }


}
