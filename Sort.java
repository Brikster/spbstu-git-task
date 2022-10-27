public class Sort {

    public static int[] sort(int[] mas) {
        // Shellsort impl
        int h = 1;

        while (h <= mas.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (int outer = h; outer < mas.length; outer++) {
                int tmp = mas[outer];
                int inner = outer;

                while (inner > h - 1 && mas[inner - h] > tmp) {
                    mas[inner] = mas[inner - h];
                    inner -= h;
                }

                mas[inner] = tmp;
            }

            h = (h - 1) / 3;
        }
        
        return mas;
    }
}
