// ObstacleFactory.java
package model;

public class ObstacleFactory {
    public Obstacle createObstacle(String type) {
        if (type.equalsIgnoreCase("Cactus")) {
            return new Cactus();
        } else if (type.equalsIgnoreCase("Bird")) {
            return new Bird();
        } else {
            throw new IllegalArgumentException("Invalid obstacle type.");
        }
    }
}
