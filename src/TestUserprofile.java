
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shahm
 */
/** this is for part 5
*/
public class TestUserprofile {

    public TestUserprofile(String temp1, String temp2) {
    }

    private static String[] genres;
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String option;
        option = "Y";
       do{
           System.out.println("Do you want to create a new profile? (Y/N): ");
           option = sc.nextLine();
           int flag=0;
           if(option.equals("Y")){
               String temp1,temp2;
               String[] temp3 = TestUserprofile.genres;
               System.out.println("Enter Username: ");
               temp1 = sc.nextLine();
               System.out.print("Enter genre: ");
               temp2 = sc.nextLine();
               for (String temp31 : temp3) {
                   if (temp2.equals(temp31)) {
                       flag=1;
                   }
               }
               if(flag==0)
                   System.out.println("Invalid Genre");
               else{
                   TestUserprofile obj = new TestUserprofile(temp1,temp2);
                   System.out.println(obj.getUserID()+"Profile Created: "+" "+obj.getGenre());
               }
           }
       }while(!option.equals("N"));
   }

    private String getUserID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getGenre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

