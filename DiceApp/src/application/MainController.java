package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

	@FXML
	private Button button4;

	@FXML
	private Button button5;

	@FXML
	private Button button2;

	@FXML
	private Button button3;

	@FXML
	private Button button8;

	@FXML
	private Button button9;

	@FXML
	private Button button6;

	@FXML
	private Button button7;

	@FXML
	private ImageView imageview1;

	@FXML
	private ImageView imageview2;

	@FXML
	private ImageView imageview3;

	@FXML
	private ImageView imageview4;

	@FXML
	private ImageView imageview5;

	@FXML
	private ImageView imageview6;

	@FXML
	private ImageView imageview7;

	@FXML
	private ImageView imageview8;

	@FXML
	private ImageView imageview9;

	@FXML
	private Button allRollButton;

	@FXML
	private Button button1;

	@FXML
	private ChoiceBox<String> diceBox;

	@FXML
	private Label diceSides;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ArrayList<Button> btn = new ArrayList<Button>();
		buttonImg(button1, imageview1);
		buttonImg(button2, imageview2);
		buttonImg(button3, imageview3);
		buttonImg(button4, imageview4);
		buttonImg(button5, imageview5);
		buttonImg(button6, imageview6);
		buttonImg(button7, imageview7);
		buttonImg(button8, imageview8);
		buttonImg(button9, imageview9);
		rollAll(allRollButton);
		diceSides.setText("Number of Sides");
		diceBox.getItems().addAll("4", "6");

	}

	public String randImage() {
		String diceSides = null;
		Random rand = new Random();

		int num = rand.nextInt(Integer.parseInt(diceBox.getValue())) + 1;
		if (diceBox.getValue() == "4")
			diceSides = "4sided";
		if (diceBox.getValue() == "6")
			diceSides = "6sided";

		String imageName = "img/" + diceSides + Integer.toString(num) + ".png";
		return imageName;

	}

	public void buttonImg(Button button, ImageView imageview) {

		button.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				setImage(imageview);
			};
		});
	}

	public void rollAll(Button allRollButton) {
		;
		allRollButton.setOnMouseClicked(new EventHandler<Event>() {
			public void handle(Event event) {
				// for (int i = 1; i <= 9; i++) {
				// String imageViewName = ("imageview" + Integer.toString(i));

				// ImageView imageview = new ImageView(imageViewName);
				// setImage(imageview);
				setImage(imageview1);
				setImage(imageview2);
				setImage(imageview3);
				setImage(imageview4);
				setImage(imageview5);
				setImage(imageview6);
				setImage(imageview7);
				setImage(imageview8);
				setImage(imageview9);

			}

			;

		});

	};

	public void setImage(ImageView imageview) {

		Image image = new Image(randImage());
		imageview.setImage(image);
	}

}
