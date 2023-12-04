package mazeAlgorithms.ui.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Scene1Controller  {

    @FXML
    private Canvas mazeCanvas;

    public void initialize() { 
		fillCanvasWithBlack();
		drawDiagonalLine();
    }

    private void fillCanvasWithBlack() {
        GraphicsContext gc = mazeCanvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, mazeCanvas.getWidth(), mazeCanvas.getHeight());
    }
	private void drawDiagonalLine() {
        GraphicsContext gc = mazeCanvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, mazeCanvas.getWidth(), mazeCanvas.getHeight());

        // Draw a diagonal line from the top-left corner to the bottom-right corner
        gc.setStroke(Color.WHITE);
        gc.setLineWidth(2); // Set the line width as needed
        gc.strokeLine(0, 0, mazeCanvas.getWidth(), mazeCanvas.getHeight());
    }
}