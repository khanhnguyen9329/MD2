package MangVaPhuongThuc;

public class TimMaxTrongMang {
    public static void main(String[] args) {
        int array [] = {2, 4, 6, 7, 8, 9,-2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println(max);

    }
}
