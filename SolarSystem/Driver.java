public class Driver {
    public static void main(String[] args) {

        SolarSystem window = new SolarSystem(1000, 1000);

        // Stars
        Star sun = new Star(100, "YELLOW");

        // Drawing the Planets
        Planet mercury = new Planet(70.0, 0, 7, "#D5D2D1", 5);
        Planet venus = new Planet(85, 200, 12, "#8B7D82", 4);
        Planet earth = new Planet(114, 120, 14, "BLUE", 3);
        Planet mars = new Planet(144, 80, 18, "RED", 2);
        Planet jupiter = new Planet(250, 30, 30, "#B45C3D", 1);
        Planet saturn = new Planet(300, 24, 24, "#c4bcaa", 0.75);
        Planet uranus = new Planet(400, 20, 20, "TEAL", 0.5);
        Planet neptune = new Planet(450, 300, 18, "BLUE", 0.25);

        // Asteroid
        Asteroids asteroids = new Asteroids(200, 2, "WHITE", 2);

        // Moons
        Moon moon = new Moon(15, 0, 4.5, "WHITE", 4, earth);
        Moon marsMoon1 = new Moon(18, 0, 4.5, "WHITE", 4, mars);
        Moon marsMoon2 = new Moon(18, 90, 4.5, "#D3D3D3", 4, mars);

        Moon Ganymede = new Moon(25, 45, 8, "#C0C0C0", 2, jupiter);
        Moon Europa = new Moon(25, 100, 4, "#fed8b1", 2, jupiter);
        Moon Io = new Moon(25, 200, 4, "#fed8b1", 2, jupiter);
        Moon Callisto = new Moon(25, 300, 3, "#fed8b1", 2, jupiter);

        while (true) {
            // Suns
            sun.draw(window);

            // Planets
            mercury.draw(window);
            venus.draw(window);
            earth.draw(window);
            mars.draw(window);
            jupiter.draw(window);
            saturn.draw(window);
            saturn.draw(window);
            uranus.draw(window);
            neptune.draw(window);

            // Moons
            moon.draw(window);
            marsMoon1.draw(window);
            marsMoon2.draw(window);
            Ganymede.draw(window);
            Europa.draw(window);
            Io.draw(window);
            Callisto.draw(window);
            // draw asteroids
            asteroids.draw(window);

            window.finishedDrawing();

        }

    }
}
