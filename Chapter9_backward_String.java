/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9_backward_string;

import javax.swing.JOptionPane;

/**
 *
 * @author SRonan
 */
public class Chapter9_backward_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("Enter a string");
        for(int x = input.length()-1; x >= 0; x--)
        {
            System.out.print(input.charAt(x));
        }
        System.out.println();
        
        for(int x = 0; x >input.length(); x++)
        {
            System.out.println(input.codePointAt(x)+10);
        }
    }
    
}
