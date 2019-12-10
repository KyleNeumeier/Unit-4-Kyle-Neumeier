import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextArea;
import java.text.DecimalFormat;

public class bankPane extends Application{
  private Label P1D1;
  private Label P1D2;
  private Label P2D1;
  private Label P2D2;

  //private double balance;
  //private String accountNumber;
  //private int amount;
  //private TextField accountNameTextField = new TextField();
  //private TextArea textArea = new TextArea();

    GridPane grid = new GridPane();
    grid.add(P1D1, 0, 0);
    grid.add(P1D2, 0, 1);
    grid.add(P2D1, 0, 2);
    grid.add(P2D2, 0, 3);
