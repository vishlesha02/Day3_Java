public class day3_array3 {
    public static void main(String[] args) {
        int a [] = {1,5,3,4,9,5};
        System.out.println("Elements of given array are : ");
        int max=a[0];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest number = " + max);

    }
}
