package mvc.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import mvc.interfaces.MVCController;
import mvc.interfaces.MVCModel;
import mvc.interfaces.MVCView;
import mvc.model.CatchTimeModel;
import mvc.model.LoginModel;
import mvc.view.CatchTimeView;
import mvc.view.LoginView;

public class CatchTimeController implements MVCController
{
	CatchTimeView view;
	CatchTimeModel model;
	
	public CatchTimeController()
	{
		this.view = new CatchTimeView();
		view.setListener(closeAction());
		this.model = new CatchTimeModel();
	}
	
	private EventHandler<ActionEvent> closeAction()
	{
		return new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0)
			{
				System.exit(0);
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
