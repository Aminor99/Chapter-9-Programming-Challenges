//Name: Asia Minor
//Date: 4-4-19
//Purpose: write a program that asks a user to enter part of a name and output phone numbers that correspond with a name

import javax.swing.JOptionPane;

public class TelemarketingPhoneNumberList{
   
   public static void main(String [] args){
      String names[] = {"John Morrison", "Micheal Vikerman", "Aria Faraday", "Chris Wimbledon", "Ava Ire", "Steve Jobs", "Sophia Martin", "John Homestuck"};
      String phoneNumbers[] = {"254-9999", "254-9632", "254-8521", "165-8315", "002-9632", "430-9015", "798-2161", "413-2009"};
      
      String input = JOptionPane.showInputDialog("Input the first couple of letters\n of a name and we'll see if\n we can find a match for you :)\n Use proper capitolization please.");
      
      compareNames(input, names, phoneNumbers);
   }
   
   public static void compareNames(String s, String n[], String pN[]){
      int counter = 0;
      
      for(int i = 0; i < n.length; i++){
         if(n[i].startsWith(s)){
            System.out.println("Here are names that match!");
            System.out.println("  " + n[i] + ", " + pN[i]);
         } else {
            counter++;
         }
      }
      if(counter > 7){
         System.out.println("It seems as if no names match :(");
      }
   }
}