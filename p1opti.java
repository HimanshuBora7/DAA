//optimised code for Insertion sort 
public class p1opti {
    public static void main(String [] args ){
        int [] arr1 = {12,9,14,8,26,6};
//showcaing unsorted array 

for(int i=0;i<arr1.length;i++){
 System.out.print(arr1[i] + " ");
 }
   int temp,j;
   
   for(int i=1;i<arr1.length;i++){
    System.out.println("inside first loop");
   temp = arr1[i];
   j = i-1;
   while(j>=0 && arr1[j] > temp){
    arr1[j+1] = arr1[j];
    j--;
   }
    arr1[j+1] = temp;
  
    }

    System.out.println("showcasing sorted array"); 
    for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i] + " ");

   }

 }
    }

