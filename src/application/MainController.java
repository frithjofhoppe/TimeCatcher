package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javafx.scene.Scene;
import javafx.stage.Stage;
import mvc.interfaces.*;
import mvc.controller.*;

public class MainController
{
	static Stage stage;

	Map<String, MVCController> controllers = new HashMap<String, MVCController>();

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
	}

	private static Stage getStage()
	{
		return stage;
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
