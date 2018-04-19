/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationsolver;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;



public class FXMLDocumentController implements Initializable {
    
      @FXML
    private AnchorPane anchorpane;
     @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;
    


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
//        number_of_var.setLayoutX(drawer.getLayoutX()+ drawer.getWidth());
//        System.out.println("d x:"+drawer.getLayoutX());
//        System.out.println("d w:"+drawer.getWidth());
        
        
        try {
            VBox box = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            drawer.setSidePane(box);
            System.out.println(box.getWidth());
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        try {
//            TextField txt = FXMLLoader.load(getClass().getResource("Solution_Box.fxml"));
//           
////            txt.setVisible(true);
//        } catch (IOException ex) {
//            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
       
        
        HamburgerSlideCloseTransition transition = new HamburgerSlideCloseTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) ->{
            transition.setRate(transition.getRate() * -1);
            transition.play();
            
            if(drawer.isShown())
            {
                drawer.close();
//                number_of_var.setVisible(false);
//                System.out.println("d x:"+drawer.getLayoutX());
//        System.out.println("d w:"+drawer.getWidth());
//        //number_of_var.setLayoutX(drawer.getWidth()+2);
            }else
            {
                drawer.open();
//                System.out.println("d x:"+drawer.getLayoutX());
//        System.out.println("d w:"+drawer.getWidth());
//        number_of_var.setLayoutX(drawer.getDefaultDrawerSize());
//        number_of_var.setVisible(true);
//                Input_Panel_Anchor.setLayoutX(drawer.getWidth()+2);
//                //Input_Panel_Anchor.setLayoutY(drawer.getLayoutY());
//                Input_Panel_Anchor.setVisible(true);
//                
        
            }
        });

      
    }    
    
}
