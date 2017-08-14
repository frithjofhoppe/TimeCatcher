package mvc.model;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import mvc.interfaces.MVCModel;

public class LoginModel implements MVCModel
{

	Scene appScene;
	Parent root;
	Button btnLogin;
	
	@Override
	public void setListener(ActionEvent listener)
	{
	}
	
	

}
