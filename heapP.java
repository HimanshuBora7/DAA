
public class heapP{
public static void main (String [] args ){
heap h1 = new heap();
h1.insert(2);
h1.insert(7);
h1.print();
}

}

class heap{
    int [] array = new int[10];
    int size = 0;

    void insert(int value ){
        size = size+1 ;
        int index = size;
        array[index] = value;

        while(index > 1 ){
        int parent_node = index/2;
        if(array[parent_node] < array[index]){
            int temp = array[index];
            array[index] = array[parent_node];
            array[parent_node] = temp;
            index = parent_node; 
        }
        else{
            return;
        }
        }
    
    }
    void print(){
        System.out.print("Heap elements: ");
        for (int i = 1; i <= size; i++) { // Only print the valid elements of the heap
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}