public class EarthRotation {

    public EarthRotation() {

    }

    public void drawWindow() {
        // Draw the window
        SolarSystem window = new SolarSystem(800, 600);
    }

    public void earthMoving() {

        // make the Earth rotate

        SolarSystem window = new SolarSystem(800, 600);
        int angleSun = 0;
        int distanceSun = 0;

        int distanceEarth = 60;

        int rotationAngle = 90;

        int rotationEarth = 10;

        int distanceMoon = 80;

        int rotationMoon = 45;

        while (true) {

            window.drawSolarObject(distanceSun, angleSun, 40, "YELLOW"); // sun

            window.drawSolarObjectAbout(distanceEarth, rotationAngle++, 15, "BLUE", 0, rotationEarth); // earth

            window.drawSolarObjectAbout(80, rotationAngle++, 5, "GREY", 0, rotationMoon); // moon
            window.finishedDrawing();

        }

    }

}
