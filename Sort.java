public class Sort {

    public static int[] sort(int[] mas) {
        int j;
        for (int i = 1; i < mas.length; i++) {
            int swap = mas[i];
            for (j = i; j > 0 && swap < mas[j - 1]; j--) {
                mas[j] = mas[j - 1];
            }
            mas[j] = swap;
        }
        return mas;
    }
}