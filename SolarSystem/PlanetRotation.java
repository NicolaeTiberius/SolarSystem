public class PlanetRotation {

    public PlanetRotation() {

    }

    public void SolarWindow() {
        SolarSystem space = new SolarSystem(1000, 1000);
    }

    public void PlanetMoving() {

        // make the planets rotate

        SolarSystem window = new SolarSystem(1000, 1000);

        double angleSun = 0;
        double angleMercury = 0;
        double angleVenus = 200;
        double angleEarth = 120;
        double angleMars = 80;
        double angleAsteroid = 0;
        double angleJupiter = 160;
        double angleSaturn = 40;
        double angleUranus = 280;
        double angleNeptune = 300;

        double distanceSun = 0;
        double distanceMercury = 70;
        double distanceVenus = 85;
        double distanceEarth = 114;
        double distanceMars = 144;
        double distanceAsteroid = 200;
        double distanceJupiter = 250;
        double distanceSaturn = 300;
        double distanceUranus = 400;
        double distanceNeptune = 450;

        double distanceMoon = 15;
        double distanceMarsMoon = 18;
        double JupiterMoonDistance = 25;
        double SaturnMoonDistance = 0;

        double angleMoon = 0;
        double angleMarsMoon = 0;
        double MarsMoonAngle2 = 90;
        double JupiterMoonAngle = 45;
        double JupiterMoonAngle2 = 100;
        double JupiterMoonAngle3 = 200;
        double JupiterMoonAngle4 = 300;
        double SaturnMoonAngle = 0;

        // Loop that displays all of the planets together orbit
        while (true) {

            // Sun
            window.drawSolarObject(distanceSun, angleSun, 100, "YELLOW");

            // Mercury
            window.drawSolarObjectAbout(distanceMercury, angleMercury, 7, "#D5D2D1", distanceSun, angleSun);

            // Venus
            window.drawSolarObjectAbout(distanceVenus, angleVenus, 12, "#8B7D82", distanceSun, angleSun);

            // Earth
            window.drawSolarObjectAbout(distanceEarth, angleEarth, 14, "BLUE", distanceSun, angleSun);

            // Moon
            window.drawSolarObjectAbout(distanceMoon, angleMoon += 2, 4.5, "#D5D2D1", distanceEarth, angleEarth);

            // Mars
            window.drawSolarObjectAbout(distanceMars, angleMars, 18, "RED", distanceSun, angleSun);

            // Jupiter
            window.drawSolarObjectAbout(distanceJupiter, angleJupiter, 30, "#B45C3D", distanceSun, angleSun);

            // Saturn
            window.drawSolarObjectAbout(distanceSaturn, angleSaturn, 24, "#c4bcaa", distanceSun, angleSun);

            // Uranus
            window.drawSolarObjectAbout(distanceUranus, angleUranus, 20, "TEAL", distanceSun, angleSun);

            // Neptune
            window.drawSolarObjectAbout(distanceNeptune, angleNeptune, 18, "BLUE", distanceSun, angleSun);

            // Mars Moons

            window.drawSolarObjectAbout(distanceMarsMoon, angleMarsMoon += 2, 4.5, "WHITE", distanceMars, angleMars);
            window.drawSolarObjectAbout(distanceMarsMoon, MarsMoonAngle2 += 2, 4.5, "#D3D3D3", distanceMars, angleMars);

            // Jupiter Galilean Moons

            // Ganymede
            window.drawSolarObjectAbout(JupiterMoonDistance, JupiterMoonAngle += 2, 8, "#C0C0C0", distanceJupiter,
                    angleJupiter);

            // Europa
            window.drawSolarObjectAbout(JupiterMoonDistance, JupiterMoonAngle2 += 2, 4, "#fed8b1", distanceJupiter,
                    angleJupiter);

            // Io
            window.drawSolarObjectAbout(JupiterMoonDistance, JupiterMoonAngle3 += 2, 4, "#fed8b1", distanceJupiter,
                    angleJupiter);

            // Callisto
            window.drawSolarObjectAbout(JupiterMoonDistance, JupiterMoonAngle4 += 2, 4, "#fed8b1", distanceJupiter,
                    angleJupiter);

            // Saturn Moons
            // for (int s = 0; s < 62; s++) {
            // double rand2 = Math.random();
            // window.drawSolarObjectAbout(SaturnMoonDistance + s, SaturnMoonAngle + s * 2 +
            // rand2, 4.5, "WHITE",
            // distanceSaturn, angleSaturn);
            // }

            // ASTEROID BELT
            for (int i = 0; i < 180; i++) {
                double rand = Math.random() * 10 - 5 + (Math.random() * 4 - 2);
                window.drawSolarObjectAbout(distanceAsteroid + rand, angleAsteroid + i * 2 + rand, 2, "WHITE",
                        distanceSun, angleSun);
            }

            // Planet Speeds

            angleMercury += 5;
            angleVenus += 4;
            angleEarth += 3;
            angleMars += 2;
            angleAsteroid += 2;
            angleJupiter += 1;
            angleSaturn += 0.75;
            angleUranus += 0.5;
            angleNeptune += 0.25;

            // Moon Speeds
            angleMoon += 4;
            angleMarsMoon += 2;
            MarsMoonAngle2 += 2;

            JupiterMoonAngle += 2;
            JupiterMoonAngle2 += 2;
            JupiterMoonAngle3 += 2;
            JupiterMoonAngle4 += 2;

            window.finishedDrawing();

        }
    }
}