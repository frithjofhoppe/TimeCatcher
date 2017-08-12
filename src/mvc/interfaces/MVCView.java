package mvc.interfaces;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;

public interface MVCView
{
	void setListener(EventHandler<ActionEvent> listener);
}
