package mvc.controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
		view.setLinkListener(hyperlink());
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

	private EventHandler<ActionEvent> hyperlink()
	{
		return new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0)
			{
				try
				{
					java.awt.Desktop.getDesktop().browse(new URI("https://www.google.ch"));
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
