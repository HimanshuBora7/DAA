//implementing merge sort 
//it is based on divide and conquer approach 
//we go on dividing the array and sort them by single single element 


public class mergeSort2 {
    public static void main (String [] args ){
     int [] arr = {12, 11 , 7,4,20 ,15 };
     System.out.println("unSorted array ");
    for(int x : arr)
     System.out.print(x + " ");
    
    
    mergesort(arr,0,arr.length-1);
    System.out.println("\nSorted array ");
    for(int x : arr)
     System.out.print(x + " ");
    }
    
    
     
    
    public static void mergesort(int array [] , int low , int high ){
    
       if(low < high ){
        int mid = (low + high )/ 2 ;
       
       mergesort(array, low, mid );
       mergesort(array, mid + 1, high);
       merge(array , low , mid , high );   
    
       }
    }
    
    public static void merge (int array [] , int low , int mid , int high ){
        int [] temp = new int [high - low + 1 ];
        int left = low ;
        int right = mid +1 ;
        int i = 0 ;
    while(left <= mid && right <= high ){
        if(array[ left ] <= array[right ])
         {
            temp[i] = array[left];
            left++;
            
         }
         else{
            temp[i] = array[right];
            right++;
            
         }
         i++;
        }
         while(left <= mid ){
            temp[i] = array[left];
            left++;
            i++;
         }
         while(right <= high ){
            temp[i] = array[right];
            right++;
            i++;
         }
    
    
    
    //copying the merged element back to the original array 
    for(int j = 0 ;j < temp.length ; j++ ){
        array[low + j ] = temp[j];
    }
    }
    
    }
