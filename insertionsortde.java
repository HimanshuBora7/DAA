public class insertionsortde {
    
public static void main (String [] args){
    int [] arr1 = {18,45,35,7,14};
    System.out.println("unsorted array ");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
    int temp;
    for(int i=1 ; i< arr1.length ; i++){
      temp = arr1[i];
      int j= i-1 ;
      while(j>= 0 && arr1[j] < temp   ){
        arr1[j+1] = arr1[j];
        j--;
      }  
      arr1[j+ 1] = temp;
    }
    System.out.println("sorted array ");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
    }
}    
}

