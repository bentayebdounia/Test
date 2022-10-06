/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alfec Informatique 2
 */
public class ClasseVerification {
   
    public boolean PassewordVerify(JTextField passwordText){
       if ( passwordText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Entrer le mot de passe ","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if ( passwordText.getText().length() < 8 ){
            JOptionPane.showMessageDialog(null, "Mot de passe moin de 8 caractère","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public void verifyCaracter(JTextField text , java.awt.event.KeyEvent evt){
        
        char c=evt.getKeyChar();
        if( Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c) )
            text.setEditable(true);
        
        else
            text.setEditable(false);
        
    }
    
    public void verifyNamber(JTextField text , java.awt.event.KeyEvent evt){
        
        if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9')
            text.setEditable(true);
        
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
               text.setEditable(true);

            else
               text.setEditable(false);
                    
        }
        
        
        
    }
    
    public void scalImage(JLabel label , String link) {
        ImageIcon icon =new ImageIcon(getClass().getResource(link));
        //reduir la taile d'image 
        //Image img = ;
        Image ImgScale = (icon).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(ImgScale);
        label.setIcon(ScaledIcon);
        
    }
   /*
    public void afficher_Panel(JPanel p1 , JPanel p2){
        p1.removeAll();
        p1.add(p2);
        
        p2.setVisible(true);
        
    }*/
   

}
