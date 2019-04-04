//Name:Asia Minor
//Date: 4-4-19
//Purpose: Write a class that will ask the user for a sentence and return the numebr of words in the sentence

import javax.swing.JOptionPane;

public class WordCounterChallenge{

   public static void main(String [] args){
      String input = JOptionPane.showInputDialog("Please enter a sentence.");
      countWords(input);
   }
   
   public static void countWords(String s){
      int counter = 1;
      
      for(int i = 0; i < s.length(); i++){
         if(Character.isSpace(s.charAt(i))){
            counter ++;
         }
      }
      JOptionPane.showMessageDialog(null, "Your sentence had " + counter + " words!");
   }  
}