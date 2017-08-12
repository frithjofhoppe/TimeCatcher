package mvc.interfaces;

import javafx.scene.Scene;

public interface MVCController
{
	MVCModel getModel();
	MVCView getView();
	Scene getScene();
}
