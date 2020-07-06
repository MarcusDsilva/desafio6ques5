/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ordem, n, termo; String r="";String r1="";
    termo=-1;
    n=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor N:"));

    for(ordem=1; ordem<=n;ordem++){
        if(ordem==1){
        r1 = r1 + "Ordem:";
        r = r + "termo:"+termo;
        }else{
              r = r + " " +termo;
        }
        if(ordem>n){
        r1 = r1 + " "+ordem+"\n";
        }else{
         r1 = r1 + " "+ordem;
        }
        if(ordem % 2 != 0){
            termo++;
        }else{
             termo+=5;
        }
    }
    JOptionPane.showMessageDialog(null,"resultado\n"+r1+"\n"+r );
    }
}
