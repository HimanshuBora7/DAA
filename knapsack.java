// 0 1 knapsack problem this problem is solved uisng dynamic propgramming where we consider all the solutions of the problem 
// and then we apply sequence of decisions to get our answer 
// In knapsack problem we have a sack with maximum weight it can hold 
// and we have some objects which needed to be carried and their is profit associated with them 
// we want to maximize our profit hence it is a optimization problem where we either need a mximum result 
// or minimum result
public class knapsack {
public static void main (String [] args ){
 int [] p = {0,1,2,5,6};//here in both the array first entry is 0 as we want 1 based indexing so 
 int [] wt = {0,2,3,4,5}; // our 1st index hold information abt the 1st object 
 int m = 8 ; //maximum weight the sack can carry 
 int n= 4; // number of objects we have

 int [] []k = new int[n+1][m+1]; // this matrix will hold the result of all possible solution 
                             //this matrix is initialised for int[n][m];
 //main logic 
  for(int i=0;i<=n;i++){
    for(int w=0;w<m;w++){
 
        //case 1:
        if(i==0 || w ==0){
             k[i][w] = 0;
        }
        //case 2:
        else if(wt[i] <= w){
            k[i][w]=Math.max(p[i] +k[i-1][w -wt[i]],k[i-1][w]);
        }
        else{
            k[i][w] = k[i-1][w];
        }
    }
  }
for(int i=0;i<=n;i++){
    for(int j=0;j<=m;j++){
        System.out.print(k[i][j]+" ");
    }
    System.out.println();
}
}    
}
