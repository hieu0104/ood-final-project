package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Trex extends Observable {
	private int positionX;
	private int positionY;
	private int speed;
	private boolean isJumping;
	private List<Observer> observers;

	public Trex() {
		positionX = 0;
		positionY = 0;
		speed = 0;
		isJumping = false;
		observers = new ArrayList<>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this, null);
		}
	}

	public void jump() {
		// Implement the jump logic

		if (!isJumping) {
			isJumping = true;
			// Notify observers about the change

			notifyObservers();
			setChanged();
		}
	}

	

	public void move() {
		// Implement the movement logic

		// Notify observers about the change
		setChanged();
		notifyObservers();
	}

	public void checkCollision() {
		// Implement the collision detection logic

		// Notify observers about the change
		setChanged();
		notifyObservers();
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isJumping() {
		return isJumping;
	}

	public void setJumping(boolean isJumping) {
		this.isJumping = isJumping;
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public int getSpeedX() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Getters and setters

}