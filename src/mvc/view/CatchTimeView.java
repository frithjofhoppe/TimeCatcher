package mvc.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import mvc.interfaces.MVCView;

public class CatchTimeView implements MVCView
{
	
	Scene appScene;
	Parent root;
	
	MenuBar mainMenuBar;
	Menu menuGeneral;
	MenuItem close;
	
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
			 	
				root = FXMLLoader.load(getClass().getResource("CatchTimeViewFXMl.fxml"));
				
				mainMenuBar = (MenuBar)root.lookup("#mainMenuBar");
				menuGeneral = mainMenuBar.getMenus().get(0);
				close = menuGeneral.getItems().get(0);
				
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void setListener(EventHandler<ActionEvent> listener)
	{
		close.setOnAction(listener);
	}
	
	public Scene getAppScene()
	{
		return appScene;
	}



}
