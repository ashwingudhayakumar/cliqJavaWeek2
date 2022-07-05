// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.ArrayList;
class HelloWorld {
    
    public static void markCloud(ArrayList<ArrayList> grid,int i,int j){
        if(i<0||j<0||i>grid.size()-1||j>grid.size()-1||(int)grid.get(i).get(j)!=1){
            return;
        }
        else{
            grid.get(i).set(j, 2); 
            markCloud( grid,i-1,j-1);
            markCloud( grid,i-1,j);
            markCloud( grid,i-1,j+1);
            markCloud( grid,i,j-1);
            markCloud( grid,i,j+1);
            markCloud( grid,i+1,j-1);
            markCloud( grid,i+1,j);
            markCloud( grid,i+1,j+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList> grid=new ArrayList();
        //getting input from user
        for(int i=0;i<n;i++){
            ArrayList tempList=new ArrayList();
            int tempVar;
            for(int j=0;j<n;j++){
                tempVar=sc.nextInt();
                tempList.add(tempVar);
            }
            grid.add(tempList);
        }
   
        
        //traverse
        int noOfClouds=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((int)grid.get(i).get(j)==1){
                    markCloud(grid,i,j);
                    noOfClouds++;
                    
                }
            }
        }
        System.out.println(noOfClouds);
    }
}
