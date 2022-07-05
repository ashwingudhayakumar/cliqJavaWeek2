// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.HashMap;
class baseDiscount{
   protected int generalDiscountonElectronics=0;
}
class totalDiscount extends baseDiscount {
    public static void main(String[] args) {
        HashMap<String, Integer> phones = new HashMap<String, Integer>();
        phones.put("Iphone", 120000);
        phones.put("OnePlus", 80000);
        HashMap<String, Integer> laptops = new HashMap<String, Integer>();
        laptops.put("Mac",220000);
        laptops.put("DELL",140000);
        Scanner sc= new Scanner(System.in);
        int option=0;
        int specificToPhones=0;
        int specificToLaptops=0;
         baseDiscount obj=new baseDiscount();
         System.out.println(phones.get("Iphone")!=null);
         while(true){
             System.out.println("Menu :\n 1 - set general discount on electronicsMenu \n 2 - set additional discount on phones \n 3 - set additional discount on laptops \n 4 - view price of a product");
             System.out.print("select one of the above menu options :");
             option=sc.nextInt();
             switch(option){
                 case 1:
                     obj.generalDiscountonElectronics=sc.nextInt();
                     break;
                case 2:
                     specificToPhones=sc.nextInt();
                     break;
                case 3:
                     specificToLaptops=sc.nextInt();
                     break;
                case 4:
                    String str=sc.next();
                    if(phones.get(str)!=null){
                       float perc=((float)obj.generalDiscountonElectronics+specificToPhones)/100;
                        System.out.println((int)phones.get(str)-(perc*(int)phones.get(str)));
                    }
                    else if(laptops.get(str)!=null){
                         float perc=((float)obj.generalDiscountonElectronics+specificToLaptops)/100;
                        System.out.println((int)laptops.get(str)-(perc*(int)laptops.get(str)));
                    }
                     else{
                         System.out.println("not found");
                     }
             }
         }
       
      
    }
}
