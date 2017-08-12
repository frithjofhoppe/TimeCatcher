package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import exception.SceneException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.interfaces.*;
import mvc.controller.*;

public class MainController
{
	static Stage stage;

	static Map<String, MVCController> controllers = new HashMap<String, MVCController>();

	MainController(Stage stage)
	{
		this.stage = stage;
		initControllers();
		showFirstView();
	}

	private void showFirstView()
	{
		MVCController m = controllers.get("logincontroller");

		if (setScene(m.getScene()))
		{
			System.out.println("OUT: setScene");
		}
	}

	private void initControllers()
	{
		controllers.put("logincontroller", new LoginController());
		controllers.put("catchtimecontroller", new CatchTimeController());
	}

	private static Stage getStage()
	{
		return stage;
	}

	public static Scene getScene(String identifier) 
	{
		if (identifier != null)
		{
			if (controllers.containsKey(identifier))
			{
				MVCController m = controllers.get(identifier);
				return m.getScene();
			} else
			{
				try
				{
					throw new SceneException("EXCEPTION MainController: The Controller has not been found");
				} catch (SceneException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else
		{
			throw new NullPointerException("EXCEPTION MainController: Null Pointer");
		}
		return null;
	}
	
	public static boolean setScene(String newScene)
	{
		return setScene(getScene(newScene));
	}

	public static boolean setScene(Scene newScene)
	{
		stage.setScene(newScene);
		stage.show();

		if (stage.getScene().equals(newScene))
		{
			return true;
		}
		return false;
	}
}
