import java.util.Arrays;

public class Module2Theme9Task1 {
    public static void main(String[] args) {

        int a[] = {8,9,6,1,14,20,13,11};

        Arrays.sort(a);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        //1 6 8 9 11 13 14 20
        System.out.println();
        int key = 6;
        System.out.println(Arrays.binarySearch(a, key));//1
        key = 4;
        System.out.println(Arrays.binarySearch(a, key));//-2 неожиданное поведение

        int a1[] = {8,9};
        int a2[] = {8,9};
        int a3[] = {8,7};
        System.out.println(Arrays.equals(a1, a2));//true
        System.out.println(Arrays.equals(a2, a3));//false

        System.out.println(Arrays.compare(a1, a2));//0
        System.out.println(Arrays.compare(a2, a3));//1
        System.out.println(Arrays.compare(a3, a2));//-1
    }
}
