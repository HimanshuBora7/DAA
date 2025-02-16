public class p11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        findAllSubarrays(array);
    }

    public static void findAllSubarrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                printSubarray(array, i, j);
            }
        }
    }

    public static void printSubarray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

