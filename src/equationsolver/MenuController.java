/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationsolver;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.TreeView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Moheb
 */
public class MenuController implements Initializable {

   @FXML
    private TreeTableView<String> tableview;

    @FXML
    private TreeTableColumn<String, String> col;
    
    
    TreeItem<String> linear_item_1 = new TreeItem<>("Linear");
    TreeItem<String> nonLinear_item_2 = new TreeItem<>("Non-Linear");
    TreeItem<String> system_of_equ_parent = new TreeItem<>("System of Equations");
    
    TreeItem<String> a_item_1 = new TreeItem<>("a");
    TreeItem<String> b_item_2 = new TreeItem<>("b");
    TreeItem<String> polynomial_parent = new TreeItem<>("Polynomials");
    
    TreeItem<String> root = new TreeItem<>(".");
    
    TreeItem<String> exit = new TreeItem<>("Exit");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       system_of_equ_parent.getChildren().setAll(linear_item_1,nonLinear_item_2);
       polynomial_parent.getChildren().setAll(a_item_1,b_item_2);
       root.getChildren().setAll(polynomial_parent,system_of_equ_parent,exit);
       col.setCellValueFactory((CellDataFeatures<String, String> param) -> {return new SimpleStringProperty(param.getValue().getValue());
});
       tableview.setRoot(root);
       tableview.setShowRoot(false);
       
       
    }    
    
    @FXML
    public void mouseClick(MouseEvent mouseEvent)
    {
        TreeItem<String> item = tableview.getSelectionModel().getSelectedItem();
        if(item.getValue().equals("Exit"))
            System.exit(0);
    }
    

    @FXML
    private void mouseClick(ContextMenuEvent event) {
    }


    
    
}
