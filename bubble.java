//bubble sort 
//in bubble sort we compare adjacent elements one by one and swap them if they are not in order


public class bubble {
public static void main (String [] args ){
    int [] arr1 = {45 , 18, 7 , 23 , 32 };

    int temp;

    System.out.println("array b4 sorting ");

    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
   for(int i = 0 ; i<arr1.length - 1 ;i++){
    for(int j = 0 ; j< arr1.length - 1 - i  ; j++){
        if(arr1[j] > arr1[j+1]){
           temp = arr1[j+1];
           arr1[j+1] = arr1[j];
           arr1[j] = temp;
        }
    }
   }
   System.out.println("\n" + "array after sorting ");

    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
}    
}
