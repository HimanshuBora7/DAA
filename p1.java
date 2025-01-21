//writing code for insertion sort again 

public class p1{
 public static void main(String [] args){
    int [] arr1 = {12,9,14,8,26,6};
//showcaing unsorted array 
System.out.println("showcasing unsorted array"); 
for(int i=0;i<arr1.length;i++){
 System.out.print(arr1[i] + " ");
 }
   int temp,j;
   
   for(int i=1;i<arr1.length;i++){
    System.out.println("inside first loop");
   temp = arr1[i];
   j = i-1;
   while(j>=0){System.out.println("inside second loop");
   if(arr1[j] > temp){
    arr1[j+1] = arr1[j];
    arr1[j] = temp;
    j--;
   }
   else{
    arr1[j+1] = temp;
    break;

   }

   }
  
    }

    System.out.println("showcasing sorted array"); 
    for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i] + " ");

   }

 }

}