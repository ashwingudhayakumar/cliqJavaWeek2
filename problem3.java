
import java.util.ArrayList;
import java.util.Scanner;
class RemoveDuplicates {
public static void main(String[] args){
    
    ArrayList<Integer> al = new ArrayList<Integer>();
    System.out.println("Enter the size of list");
    Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      for(int i=0;i<size;i++){
          int temp=sc.nextInt();
          al.add(temp);
      }
    
System.out.println("Before"+al);
 
for(int i=0;i<al.size();i++){
 
 for(int j=i+1;j<al.size();j++){
            if(al.get(i).equals(al.get(j))){
                al.remove(j);
                j--;
            }
    }
 
 }
System.out.println("After"+al);
 
}
 
}
