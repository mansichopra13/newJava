import java.util.Scanner;

public class Goodfood {
    //public static void knowCountNo(String []foodName , int key){
    // getting input of username
   /*         Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR NAME");
    String userName = sc.nextLine(); 
    //make user contact private later
    System.out.println("ENTER YOUR CONTACT NUMBER");
     int userContact = sc.nextInt();
    // add if function or other function to validate 10digit not less than not more than that
    // this will give randomcounnt number in between 1 to 100
        int randomNum= (int)(Math.random()*10);
        System.out.println("THIS IS YOUR ORDER NUMBER " + randomNum);    */

      /*   for(int i=0;i<foodName.length;i++){
            if(foodName[i]==key){
                System.out.println(i);
            }
        } */
        public static int menu(int foodNo )
        {
           switch(foodNo){
            case 1:
            System.out.println("Dosa");
            break;
            case 2:
            System.out.println("Paneer Tikka");
            break;
            case 3:
            System.out.println("Chesse corn nuggets");
            break;
            case 4:
            System.out.println("Burger");
            break;
            case 5 :
            System.out.println("Pizza");
            break;
            case 6:
            System.out.println("pasta");
            break;
            case 7:
            System.out.println("Maggi");
            break;
           default:
            System.out.println("Candy");
            break;
           }
           return -1;
        }
    
    

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR NAME");
    String userName = sc.nextLine();
    System.out.println("ENTER YOUR CONTACT NUMBER");
     double userContact = sc.nextDouble();
     int randomNum= (int)(Math.random()*10);
        System.out.println("THIS IS YOUR ORDER NUMBER " + randomNum);
     System.out.println("_______________________________");
        System.out.println("ENTER YOUR FOOD NUMBERS");
        int foodNo = sc.nextInt();
       
            
        menu(foodNo);
        
        
    }
}

