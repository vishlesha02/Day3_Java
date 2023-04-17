public class day3_array4 {
    public static void main(String[] args) {

        int a [] = {1,5,6,3,8};
        System.out.println("Elements of given array are : ");

        int min=a[0];
        for (int i = 0; i <a.length ; i++) {

            System.out.println(a[i]);

            if (a[i] < min)
            {
                min = a[i];
            }

        }System.out.println("Smallest Number = " + min);
    }
}
