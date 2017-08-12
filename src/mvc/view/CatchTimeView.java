package mvc.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import mvc.interfaces.MVCView;

public class CatchTimeView implements MVCView
{
	Scene appScene;
	Parent root;

	ToolBar toolbar;

	MenuButton mainMenu;
	MenuItem mainMenuOptExit;

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

			toolbar = (ToolBar) root.lookup("#toolBar");
			mainMenu = (MenuButton) toolbar.getItems().get(0);
			mainMenuOptExit = mainMenu.getItems().get(0);

		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void setListener(EventHandler<ActionEvent> listener)
	{
		mainMenuOptExit.setOnAction(listener);
	}

	public Scene getAppScene()
	{
		return appScene;
	}
}
