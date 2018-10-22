/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author VIVEK
 */
public class Order {
    public String exactOrder(String ss){
        String str = "";
        int i = 0;
        while(i<ss.length() && ss.charAt(i)==' '){
            i++;
        }
        while(i<ss.length()){
            if(ss.charAt(i)==' '){
                while(i<ss.length() && ss.charAt(i)==' '){
                    i++;
                }
                if(i<ss.length()){
                    str += ' ';
                }
            }
            else{
                str += ss.charAt(i);
                i++;
            }
        }
               
        if(str.equalsIgnoreCase("who are you") || str.equalsIgnoreCase("who are you?") || 
                str.equalsIgnoreCase("who are u") || str.equalsIgnoreCase("who are u?") || 
                str.equalsIgnoreCase("who r you") || str.equalsIgnoreCase("who r you?") || 
                str.equalsIgnoreCase("who r u") || str.equalsIgnoreCase("who r u?") )
        {
            return "who are you";
        }
        else if(str.equals("")){
            return "";
        }
        else if(str.equalsIgnoreCase("sudoku")){
            return "Sudoku is a game " +
                    "There are three levels in the game.In easy level there are 17 to 23 no of vacant boxes.\n" +
"In medium level,33 to 39 and in hard 45 to 50 numbers of vacant boxes that you have to\n" +
"fill with numbers (1-9).\n" +
"There will unique solution for all 9x9 grid;\n" +
"You can check if your filled boxes are correct or not,you can reset all wrong answers and\n" +
"also full reset is available. After filling all vacant boxes you have to click submit button\n" +
"and then you'll get your result.";
        }
        else if(str.equalsIgnoreCase("open file manager") ||
                str.equalsIgnoreCase("open files") ||
                str.equalsIgnoreCase("open file") || str.equalsIgnoreCase("file manager") ){
            return "file manager";
        }
        else if(str.startsWith("open")){
            return str;
        }
        return "not found";
    }
}
