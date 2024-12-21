package hust.soict.hedspi.javafx;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ToggleGroup;

public class PainterController {
	@FXML
    private ToggleGroup Tools;

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton eraser;

    @FXML
    private RadioButton pen;
    
    private Color colorOption =  Color.BLACK; ;

  

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();

    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Rectangle clipArea = new Rectangle(0, 0, drawingAreaPane.getWidth(), drawingAreaPane.getHeight());
    	drawingAreaPane.setClip(clipArea);
    
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, colorOption);
    	drawingAreaPane.getChildren().add(newCircle);

    }
    void initialize() {
        assert drawingAreaPane != null : "fx:id=\"drawingAreaPane\" was not injected: check your FXML file 'Painter.fxml'.";

    }
    
    @FXML
    void eraserSelected(ActionEvent event) {
    	 colorOption = Color.WHITE;
    }

    @FXML
    void penSelected(ActionEvent event) {
    	 colorOption = Color.BLACK;

    }

}
