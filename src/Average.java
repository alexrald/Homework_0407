public class Average {
    public static double getAverage(int... iValues)
    {
        double sum = 0;
        for (int i = 0; i < iValues.length; i++) {
            sum += iValues[i];
        }
        return sum/iValues.length;
    }
}
