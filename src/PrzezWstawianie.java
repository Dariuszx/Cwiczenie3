
public class PrzezWstawianie implements SortingAlgorithm {

    public int czas;

    @Override
    public double[] sort( double[] unsortedVector ) {

        long dt = System.nanoTime();
        int i, j, size = unsortedVector.length;
        double x;

        for(j = size - 2; j >= 0; j--)
        {
            x = unsortedVector[j];
            i = j + 1;

            while( (i < size) && (x > unsortedVector[i]) )
            {
                unsortedVector[i - 1] = unsortedVector[i];
                i++;
            }

            unsortedVector[i - 1] = x;
        }

        //System.out.println( "Czas sortowania " + (System.nanoTime() - dt) / 1000 + " mikro sekund");
        czas = (int)((System.nanoTime() - dt) / 1000);

        return unsortedVector;
    }
}
