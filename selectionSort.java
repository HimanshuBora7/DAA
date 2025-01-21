public class selectionSort {
    public static void main (String [] args ){

        int [] arr1 = {18,45,35,7,14};
        System.out.println("unsorted array ");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
        for(int i  = 0;i<arr1.length -  1 ;i++){
            int min = i;  //min is used to store the index of minimum element from the unsorted sub list not the minimum element 
            int temp1; //will be used for swapping 
            for(int j = i+1 ; j <arr1.length ; j++){
            if(arr1[j] < arr1[min]){
                min = j;         //we need index of minimum element from the unsorted arrray not the elsement itself 
            }
           
            }
            if(min != i){ //if index is diifenrent then we swap 
                temp1 = arr1[min];
                arr1[min] = arr1[i];
                arr1[i] = temp1;
            }
        }

        System.out.println("sorted array ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }

    }
}
