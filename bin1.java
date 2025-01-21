import java.util.Arrays;

public class bin1 {
    public static void main(String[] args) {
        int[] arr1 = {18, 28, 38, 78, 48};
        
        // Sort the array before applying binary search
        Arrays.sort(arr1);

        int flag = 0;
        int element = 28;
        int i = 0;
        int j = arr1.length - 1;
        int mid;

        while (i <= j) {
            mid = (i + j) / 2;
            if (arr1[mid] == element) {
                flag++;
                break;
            } else if (arr1[mid] > element) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        
        if (flag != 0) {
            System.out.println("Item found");
        } else {
            System.out.println("Not found");
        }
    }
}
