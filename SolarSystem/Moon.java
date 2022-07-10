public class Moon extends Planet {

    private Planet planet;

    public Moon(double distance, double angle, double diameter, String color, double speed, Planet planet) {
        super(distance, angle, diameter, color, speed);
        this.centerDistance = 0;
        this.centerAngle = 0;
        this.planet = planet;
    }

    @Override
    public void draw(SolarSystem window) {
        this.centerDistance = planet.getDistance();
        this.centerAngle = planet.getAngle();
        window.drawSolarObjectAbout(distance, angle, diameter, color, centerDistance, centerAngle);
        this.angle += speed;
    };

}
