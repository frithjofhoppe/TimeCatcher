package mvc.controller;

import application.MainController;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import mvc.interfaces.MVCController;
import mvc.interfaces.MVCModel;
import mvc.interfaces.MVCView;
import mvc.model.LoginModel;
import mvc.view.LoginView;

public class LoginController implements MVCController
{
	LoginView view;
	LoginModel model;
	
	public LoginController()
	{
		this.view = new LoginView();
		view.setListener(loginAction());
		this.model = new LoginModel();
	}
	
	private EventHandler<ActionEvent> loginAction()
	{
		return new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0)
			{
				System.out.println(view.getPassword() + " " +view.getUsername());
				MainController.setScene("catchtimecontroller");
			}
			
		};
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

	@Override
	public Scene getScene()
	{
		return view.getAppScene();
	}

}
