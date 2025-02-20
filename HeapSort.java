// heap is a complete binary tree 
// binary tree is a data structure where there is a parent node and it has atmost 2 child nodes
// complete binary tree : complete binary tree neeeds to satisfy two conditions 
//  first > every level shld be completely filled except laast level
//  >nodes are always added from the left or lean towards left
// It comes with the heap order property where it can be either max heap or in min heap 
//  max heap : parent node shld be greater than child node
//  min heap : parent node shld be smaller than child node
// we implement heap in form of array  
//  it's node at i'th index have some basic properties
//  its left node will be located at (2*i) th index
//  its right node will be located at (2*i + 1 ) th index    
//  its parent node will be located at (i/2) th index 

// INSERTION IN HEAP (max heap )
// we implement heap in form of array 
// the value to be inserted is inserted at last index 
// 0th index is left empty 
// after insertion at last position it is compared with its parent node if it is greater than parent node than it is swaped 

public class HeapSort {
    public static void main(String [] args ){
    heap h1 = new heap();
    h1.insert(5);
    h1.insert(15);
    h1.insert(25);
    h1.insert(35);
    h1.insert(45);
    h1.insert(55);
    h1.print_array();
    h1.DeletefromHeap();
    System.out.println("after deletion ");
    h1.print_array();
    int [] array = { -1 , 54, 53,55,52 , 50 };
    int n = 5 ;
    for(int i = n /2 ; i > 0  ; i--){
      h1.heapify(array,n,i);
    }


    System.out.println("printlng the heapified array ");
    for(int i = 1 ; i <= n ; i++){
        System.out.print(" " + array[i]);
    }
    //heap sort
     h1.heapsort(array, n);


        System.out.println("\nprintlng the sorted array ");
     for(int i = 1 ; i <= n ; i++){
         System.out.print(" " + array[i]);
        }
    }    



}
class heap{

    int [] array = new int[10];
   int size = 0 ;
    
    void insert(int value ){

        size = size +1 ;

        int index = size; // putting the value at last postion 

        array[index ] = value ;
 
       while(index > 1){  // making it satisfy the max heap property 
         int parent = index/2;
         if(array[parent ] < array[index ]){
           int temp = array[parent];
           array[parent] = array[index];
           array[index ]= temp;
           index = parent ;
   
         }
         else{
            return;
         }
        }
    }
    void print_array(){
        for(int i =1 ; i <= size ;i++){
            System.out.print( array[i] + " ");
        }
    }
    void DeletefromHeap() { //deletion from heap means deletion of root node 
       
        if (size == 0 ){
        System.out.println("nothing to delete ");
        return;
        } 

        array[1] = array[size]; // step 1 :took our last node in place of root node and decreased the size to delete previous root node 
        size -- ;
        
        // step 2:Now placing the root node at its right position 

        int i = 1 ;
        while(i > size ){ // we have to go downwards so we go on comparing left and right node till it reaches its correct  position
            int left_node = 2*i;
            int right_node = 2*i +1 ;
            
            if(left_node > size && array[left_node] > array[i]){
                 int temp = array[left_node];
                 array[left_node] = array[i];
                 array[i] = temp;
                 i = left_node;
            }
            else if(right_node >  size && array[right_node] > array[i]){
                int temp = array[right_node];
                array[right_node] = array[i];
                array[i] = temp;
                i = right_node;
            }
            else {
                return;
            }
            
        }

    }
    void heapify(int [] arr , int n , int i ){
        int largest = i ;
        int left = 2*i ;
        int right = 2*i +1 ;
        if(left <= n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right] ){
            largest = right;
        }
        if(largest != i ){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
    void heapsort(int arr [] , int n){
        int size = n ;

        while(size > 1 ){
            //step 1 : swap
            int temp = arr[size ];
            arr[size] = arr[1];
            arr[1] = temp;
            size -- ;
            //step 2: 
            heapify(arr, size, 1);
        }
    }






}
 