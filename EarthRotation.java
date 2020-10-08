public class EarthRotation {

    public EarthRotation() {

    }
    
    public void drawWindow(){
        //Draw the window
        SolarSystem window = new SolarSystem(600, 400);
    }
    
    public void earthMoving(){
    
        //make the Earth rotate

        SolarSystem window = new SolarSystem(600, 400);
        int angleE = 90;
        int angleS = 90;
        int distanceE = -5;
        int distanceS = 35;

        for (int rotation = 0; rotation < 50; rotation++) {

            window.finishedDrawing();
            window.drawSolarObject(distanceS, angleS, 40, "YELLOW");
            window.drawSolarObjectAbout(distanceE, angleE, 15, "BLUE", rotation, rotation * angleE);
            window.finishedDrawing();
        }


    }


}

