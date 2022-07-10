public class Asteroids extends SolarObject {

    public Asteroids(double distance, double diameter, String color, double speed) {
        this.distance = distance;
        this.angle = 0;
        this.diameter = diameter;
        this.color = color;
        this.centerDistance = 0;
        this.centerAngle = 0;
        this.speed = speed;
    }

    @Override
    public void draw(SolarSystem window) {
        for (int i = 0; i < 180; i++) {
            double rand = Math.random() * 10 - 5 + (Math.random() * 4 - 2);
            window.drawSolarObjectAbout(distance + rand, angle + i * 2 + rand, 2, "WHITE", centerDistance, centerAngle);
        }

    }

}
