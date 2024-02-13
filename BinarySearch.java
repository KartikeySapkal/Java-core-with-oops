import java.text.BreakIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int[] a = {2,345,56,43,35,34,76};
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");

//        linear search
        int key = 56;
        System.out.println("Linear Search");
        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                System.out.println("Key Found at: " + i + "th Index");
            }
        }

        //sorting the array
        int temp;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[j+1]<a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for(int i:a) {
            System.out.print(i + " ");
        }

//      binary search
        System.out.println("Binary Sort: ");
        int low=0;
        int high=a.length;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) {
                System.out.println("Key Found at: " + mid + "th Index");
                break;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }



    }
}
