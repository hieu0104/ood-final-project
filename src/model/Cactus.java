package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;


public class Cactus extends Obstacle {

	public static final int Y_LAND = 125;
	
	private int posX;
	private int width;
	private int height;
	
	private BufferedImage image;
	private Trex trex;
	
	private Rectangle rectBound;
	
	public Cactus(Trex trex, int posX, int width, int height, BufferedImage image) {
		this.posX = posX;
		this.width = width;
		this.height = height;
		this.image = image;
		this.trex = trex;
		rectBound = new Rectangle();
	}
	
	public Cactus() {
		// TODO Auto-generated constructor stub
	}

	public void update() {
		posX -= trex.getSpeedX();
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, posX, Y_LAND - image.getHeight(), null);
		g.setColor(Color.red);
//		Rectangle bound = getBound();
//		g.drawRect(bound.x, bound.y, bound.width, bound.height);
	}
	
	public Rectangle getBound() {
		rectBound = new Rectangle();
		rectBound.x = (int) posX + (image.getWidth() - width)/2;
		rectBound.y = Y_LAND - image.getHeight() + (image.getHeight() - height)/2;
		rectBound.width = width;
		rectBound.height = height;
		return rectBound;
	}

	@Override
	public boolean isOutOfScreen() {
		if(posX < -image.getWidth()) {
			return true;
		}
		return false;
	}
	
    @Override
    public void draw() {
        System.out.println("Drawing a cactus obstacle.");
    }
}
