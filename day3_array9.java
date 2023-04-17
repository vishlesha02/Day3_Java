public class day3_array9 {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 3, 4};


        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Elements in ascending order are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i]);

        }
    }
}

