import java.util.ArrayList;
import java.util.Scanner;

public class Sunset {
    public static void main(String[] args) {
        int[] buildings = createBuildings();
        countBuildings(buildings);
    }

    public static int[] createBuildings() {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of building 1: ");
        arr[0] = scan.nextInt();
        System.out.println("Enter the height of building 2: ");
        arr[1] = scan.nextInt();
        System.out.println("Enter the height of building 3: ");
        arr[2] = scan.nextInt();
        System.out.println("Enter the height of building 4: ");
        arr[3] = scan.nextInt();
        System.out.println("Enter the height of building 5: ");
        arr[4] = scan.nextInt();
        return arr;
    }

    public static void countBuildings(int[] arr) {
        int count = 1;
        int maxHeight = arr[0];
        String prnt = "Building 1";
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                count++;
                maxHeight = arr[i];
                prnt += ", Building " + (i + 1);
            }
        }
        prnt+= " can see the sunset.";
        System.out.println(prnt);
        System.out.println("This makes a total of " + count + " buildings.");
    }

}