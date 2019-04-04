//Name: Asia Minor
//Date: 4-4-19
//Purpose: Ask the user to input a string and then have the output be the string but backwprds

import javax.swing.JOptionPane;

public class BackwardString{

   public static void main (String[] args){
      String input = JOptionPane.showInputDialog("Input a word please!");
       
      makeBackwards(input);
   }
   
   public static void makeBackwards(String s){
      for(int i = s.length(); i > 0; i--){
         System.out.print(s.charAt(i-1));
      }
   }
}