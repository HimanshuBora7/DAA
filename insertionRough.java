public class insertionRough {
    public static void main (String []args ){
        int [] array = {3,2,7,4,6};
        System.out.println("unsorted array ");
        for(int x : array ){
            System.out.print(x + " ");
        }
    //insertion sort 
     
    for(int i = 1 ; i < array.length ; i++){
        int temp = array[i];
        int j = i -1 ;
        while(j>= 0 && array[j] >temp){
        array[j+1] = array[j];
        j--;
        }
        array[j+1]  = temp;
    }
    System.out.println("sorted array ");
        for(int x : array ){
            System.out.print(x + " ");
        }

    }

}
