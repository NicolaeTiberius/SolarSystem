public class Planet extends SolarObject {

    public Planet(double distance, double angle, double diameter, String color, double speed) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
        this.centerDistance = 0;
        this.centerAngle = 0;
        this.speed = speed;
    }

}
