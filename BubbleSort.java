public class BubbleSort {

    public static int[] sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int tmp = mas[j];
                    mas[j] = mas[i];
                    mas[i] = tmp;
                }
            }
        }
        return mas;
    }
}
