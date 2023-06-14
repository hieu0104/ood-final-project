// GameController.java
package controller;

import model.Obstacle;
import model.ObstacleFactory;
import model.Trex;
import view.GameView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameController implements KeyListener {
    private Trex trex;
    private GameView gameView;
    private ObstacleFactory obstacleFactory;

    public GameController() {
        trex = new Trex();
        gameView = new GameView(trex);
        obstacleFactory = new ObstacleFactory();

        // Register the controller as the key listener
        gameView.addKeyListener(this);
        gameView.setFocusable(true);
        gameView.requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Implement keyTyped event handling if needed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle the keyPressed event for controlling the T-Rex
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_SPACE) {
            trex.jump();
        } else if (keyCode == KeyEvent.VK_C) {
            Obstacle cactus = obstacleFactory.createObstacle("Cactus");
            cactus.draw();
        } else if (keyCode == KeyEvent.VK_B) {
            Obstacle bird = obstacleFactory.createObstacle("Bird");
            bird.draw();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Implement keyReleased event handling if needed
    }

    public static void main(String[] args) {
        new GameController();
    }
}
