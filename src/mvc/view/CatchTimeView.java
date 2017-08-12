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

public class CatchTimeView implements MVCView
{
	Scene appScene;
	Parent root;
	Button btnLogin;

	public CatchTimeView()
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
			root = FXMLLoader.load(getClass().getResource("CatchTimeViewFXML.fxml"));
			
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setListener(EventHandler<ActionEvent> listener)
	{
		
	}

	public Scene getAppScene()
	{
		return appScene;
	}
}
