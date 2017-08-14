package mvc.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import mvc.interfaces.MVCView;

public class LoginView implements MVCView
{

	Scene appScene;
	Parent root;
	Button btnLogin;
	TextField txtUsername;
	TextField txtPassword;
	
	public LoginView()
	{
		init();
		binContent();
	}
	
	private void binContent()
	{
		appScene = new Scene(root);
	}

	private void init()
	{
		 try
			{
				root = FXMLLoader.load(getClass().getResource("LoginViewFXML.fxml"));
				btnLogin = (Button) root.lookup("#btnLogin");
				txtPassword = (TextField) root.lookup("#lblPassword");
				txtUsername = (TextField) root.lookup("#lblUsername");
				
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public String getPassword()
	{
		return txtPassword.getText();
	}
	
	public String getUsername()
	{
		return txtUsername.getText();
	}
	
	public Scene getAppScene()
	{
		return appScene;
	}

	@Override
	public void setListener(EventHandler<ActionEvent> listener)
	{
		btnLogin.setOnAction(listener);
	}

}
