package mvc.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
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
	Scene loginScene;
	
	public Scene getScene()
	{
		return loginScene;
	}

	public CatchTimeController()
	{
		this.model = new CatchTimeModel();
		this.view = new CatchTimeView();
		addListener();
		loginScene = this.view.getAppScene();
	}
	
	class CatchTimeListener implements EventHandler<ActionEvent>
	{
		@Override
		public void handle(ActionEvent arg0)
		{
			
		}
	}
	
	private void addListener()
	{
		view.setListener(new CatchTimeListener());
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
