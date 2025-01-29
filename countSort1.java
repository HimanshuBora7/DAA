//In count sort instead of comparing elements value we compare
// their frequency and place them accordingly  

//time complexity here is O(n+k)

// step 1 : find the largest number in the arrray 
// step 2 : make new array with size largest_number+1
// step 3 : traverse the orginal array n start recording frequency of each in newly created array 
//          corresponding to their index
// step 4 : now make new array traversing the frequency array 



public class countSort1 {
public static void main (String args [] ){
   int [] array = {1,3,8,3,5,6,2};
   
   System.out.println("unsorted array ");
   for(int i=0;i<array.length;i++){
       System.out.print(array[i] + " ");
   }

   countsort(array);

   System.out.println("sorted array ");
   for(int i=0;i<array.length;i++){
       System.out.print(array[i] + " ");
   }





}    



public static void countsort(int [] array ){

//step 1 : finding the largest element 

int max = array[0];
for(int x : array){
    if(x > max )
     max = x;
}
// creating new array 
int [] countArray = new int[max+1];
//recording frequency
 for(int num : array){
    countArray[num ]++;
 }

 //modifying original array based on recently created frequency array

 int index = 0; 

 for(int i = 0;i<max+1;i++){
    while(countArray[i] > 0 ){
        array[index] = i;
        index++;
        countArray[i]--;
    }
 } 



}


}