// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Stack;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Stack<Integer> inputStack=new Stack<>();
        Stack<Integer> outputStack=new Stack<>();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        int totalSize=sc.nextInt();
        
        System.out.print("Enter operation and values (type exit to print result) :");
        
        int currentSize=0;
        sc.nextLine();
        String enterOperationAndValue=sc.nextLine();
        String operationAndValueArray[]=enterOperationAndValue.split(" ");
        String operation="null";
        int value=-100;
        if(operationAndValueArray.length==1){
            operation=operationAndValueArray[0];
        }
        else if(operationAndValueArray.length==2){
            operation=operationAndValueArray[0];
            value=Integer.parseInt(operationAndValueArray[1]);
        }
        boolean once=false;
        
        do{
            if(once){
                System.out.print("Enter operation and values (type exit to print result) :");
                   enterOperationAndValue=sc.nextLine();
                   operationAndValueArray=enterOperationAndValue.split(" ");
                   if(operationAndValueArray.length==1){
                      operation=operationAndValueArray[0];
                    }
                    else if(operationAndValueArray.length==2){
                      operation=operationAndValueArray[0];
                      value=Integer.parseInt(operationAndValueArray[1]);
                     }
            }once=true;
            switch(operation){
                case "enqueue":
                    if(currentSize<totalSize){
                        inputStack.add(value);
                        currentSize++;
                    }else{
                        System.out.println("Error queue is full");
                        operation="exit";
                    }
                    
                    
                break;
                case "dequeue":
                    if(!outputStack.empty()){
                        currentSize--;
                        outputStack.pop();
                    }
                    else if(!inputStack.empty()){
                        while(!inputStack.empty()){
                            outputStack.add(inputStack.pop());
                        }
                        outputStack.pop();
                      
                        currentSize--;
                    }
                    else{
                        System.out.println("Error queue is empty");
                        operation="exit";
                    }
                    
                break;
                case "exit":
                   boolean affect=false;
                    while(!outputStack.empty()){
                       System.out.println(outputStack.pop());
                       affect=true;
                    }
                    while(!inputStack.empty()){
                        outputStack.add(inputStack.pop());
                    }
                    while(!outputStack.empty()){
                        System.out.println(outputStack.pop());
                        affect=true;
                    }
                    if(!affect){
                        System.out.println("queue is empty");
                    }
                  
                  
                break;
            }
        }while(!operation.equals("exit"));
    }
}
