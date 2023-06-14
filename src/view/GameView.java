package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Trex;

public class GameView extends JPanel implements Observer {
    private Trex trex;

    public GameView(Trex trex) {
        this.trex = trex;
        trex.addObserver(this);

        // Set up the view
        JFrame frame = new JFrame("T-Rex Game");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the T-Rex and other game objects based on the Trex's position
        int trexX = trex.getPositionX();
        int trexY = trex.getPositionY();

        g.setColor(Color.BLACK);
        g.fillRect(trexX, trexY, 50, 50);
    }

    @Override
    public void update(Observable o, Object arg) {
        // Update the view when notified of changes in the Trex model
        repaint();
    }
}