//this is quick sort with time complexity nlogn similar to merge sort but
//it has advantage over space complexity where merge sort have space complexitu ofO(n)
// coz merge sort requires temporary array in contrast to that quick sort don't require 
// an temporary array so it has space complexity of O(1) 
//
// step 1:  choose a pivot , it can be any element from the array 
// step 2:  find the correct position of pivot so smaller shld be left to it and 
//          larger number shld be right of our pivot element and this is achived using 
//          flags low n high then using counters i n j inside 
// step 3:  after placing pivot return its index and name that as partion_index 
// step 4:  repeat the steps for left half i.e from low to partion_index -1 
//          and right half i.e from partion_index + 1 to high 

public class quickSort {
    public static void main (String []args ){
        int [] array = { 10 , 4, 6,2,3 , 18,15,7};
        
        System.out.println("unSorted array ");
        for(int x : array)
         System.out.print(x + " ");
        
        quick(array, 0, array.length-1);
 
        System.out.println("\nSorted array ");
        for(int x : array)
         System.out.print(x + " ");

    }
    public static void quick(int [] array , int low , int high ){
           
  if(low < high ){
    int partion_index = pivot_func( array , low , high ) ;
    quick( array , low , partion_index -1 );
    quick(array, partion_index + 1 , high) ;

  }
   

    }
    public static int pivot_func(int [] array , int low , int high ){
     int pivot = array[low ];
     int i = low +1  ;
     int j = high ;
     int temp;
     while(i <= j ){
        while(array[i] < pivot && i <= high){
            i++;
        }
        while(array[j] > pivot && j >= low){
            j--;
        }
        if(i < j ){
         temp = array[i] ;
         array[i] = array[j];
         array[j] = temp; 
        }
     }
     temp = array[low] ;
     array[low] = array[j];
     array[j] = temp;
     return j; 
    }
}
