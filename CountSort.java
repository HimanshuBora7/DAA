



public class CountSort {
    public static void main (String [] args ){
     int [] array1 = { 1 , 5,3,3,2,7};
     sort(array1);
     
     for (int num : array1) {
        System.out.print(num + " ");
    }
    }


public static void sort(int [] array){
    if(array == null || array.length <= 1){
        return;
    }
    
    int max = array[0];
    for(int num : array){
        if(max < num){
            max = num;
        }
    }

    int [] CountArray = new int[max+1];

    for(int num : array){
        CountArray[num]++;
    }

    int index = 0;
    for(int i=0;i<=max;i++){
        while(CountArray[i] > 0 ){
            array[index] = i;
            index++;
            CountArray[i]--;
        }
    }
}
  

}
