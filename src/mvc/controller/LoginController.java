package mvc.controller;

import application.MainController;
import exception.SceneException;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import mvc.interfaces.MVCController;
import mvc.interfaces.MVCModel;
import mvc.interfaces.MVCView;
import mvc.model.LoginModel;
import mvc.view.LoginView;

public class LoginController implements MVCController
{

	LoginView view;
	LoginModel model;
	Scene loginScene;
	
	public Scene getScene()
	{
		return loginScene;
	}

	public LoginController()
	{
		this.model = new LoginModel();
		this.view = new LoginView();
		addListener();
		loginScene = this.view.getAppScene();
	}
	
	class LoginListener implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent arg0)
		{
			if(((Node)arg0.getSource()).getId().equals("btnLogin"))
			{
				if(!MainController.setScene("catchtimecontroller"))
				{
					System.out.println("Fehler");
				}
			}
		}
	}
	
	private void addListener()
	{
		view.setListener(new LoginListener());
	}

	@Override
	public MVCModel getModel()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MVCView getView()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
