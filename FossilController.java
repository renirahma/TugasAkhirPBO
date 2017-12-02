/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamtangan;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author client
 */
public class FossilController implements Initializable {

    @FXML
    private Button buy;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnbuy(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("pembayaran.fxml"));
                Scene scene = new Scene (fxmlLoader.load(),720, 500);
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }

    @FXML
    private void btnback(ActionEvent event)  throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
                
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                Scene scene = new Scene (fxmlLoader.load(),720, 450);
                
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
    }
    
}
