public abstract class SolarObject {

    protected double distance;
    protected double angle;
    protected double diameter;
    protected String color;
    protected double centerDistance;
    protected double centerAngle;
    protected double speed;

    public double getDistance() {
        return this.distance;
    }

    public double getAngle() {
        return this.angle;
    }

    public void draw(SolarSystem window) {
        window.drawSolarObjectAbout(distance, angle, diameter, color, centerDistance, centerAngle);
        this.angle += speed;
    };

}
