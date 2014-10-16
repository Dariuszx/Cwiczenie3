
public class PrzezWstawianie implements SortingAlgorithm {

    @Override
    public double[] sort( double[] unsortedVector ) {

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

        return unsortedVector;
    }
}
