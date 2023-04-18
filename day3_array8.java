import java.util.Arrays;

public class day3_array8 {
    public static void main(String[] args) {

        int a [] = {2,6,3,2,3,5,4,7};
        System.out.println("Elements in array are");

        for (int i = 0; i <a.length ; i++) {


        for (int j =i+1 ; j <a.length ; j++) {

            if(a[i]==a[j])
            {
                System.out.println("duplicate " + a[j]);
            }


        }}
    }
}
