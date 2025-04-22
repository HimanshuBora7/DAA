public class selectionR {
    
    public static void main (String []args ){
        int [] array = {3,2,7,4,6};
        System.out.println("unsorted array ");
        for(int x : array ){
            System.out.print(x + " ");
        }
    //selection sort 
     for(int i = 0;i<array.length-1;i++){
        int min = i;
        int temp;
        for(int j = i+1 ; j < array.length ;j ++){
            if(array[j] < array[min]){
                min =j;
            }
        } 
        if(min != i ){
                temp = array[min];
                array[min] = array[i];
                array[i] = temp;
        }
        
        
        }
        
        System.out.println("sorted array ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
     }
     
 }






