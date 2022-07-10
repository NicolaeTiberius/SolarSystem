public class Star extends SolarObject {

    public Star(double diameter, String color) {
        this.distance = 0;
        this.angle = 0;
        this.diameter = diameter;
        this.color = color;
        this.centerDistance = 0;
        this.centerAngle = 0;
        this.speed = 0;
    }

    // @Override
    public void draw(SolarSystem window) {

        // Drawing the sun
        window.drawSolarObject(distance, angle, diameter, color);

    }

}
