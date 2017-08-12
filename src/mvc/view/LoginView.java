package mvc.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import mvc.interfaces.MVCView;

public class LoginView implements MVCView
{
	Scene appScene;
	Parent root;
	Button btnLogin;

	public LoginView()
	{
		init();
		bindContent();
	}
	
	private void bindContent()
	{
		appScene = new Scene(root);
	}

	private void init()
	{
		 try
		{
			root = FXMLLoader.load(getClass().getResource("LoginViewFXML.fxml"));
			btnLogin = (Button) root.lookup("#btnLogin");
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setListener(EventHandler<ActionEvent> listener)
	{
		btnLogin.setOnAction(listener);
	}

	public Scene getAppScene()
	{
		return appScene;
	}
}
