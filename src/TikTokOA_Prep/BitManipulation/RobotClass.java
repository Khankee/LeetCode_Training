package TikTokOA_Prep.BitManipulation;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot myRobot = new Robot();
        Color color;
        PointerInfo a;
        Point b;
        int x,y;
        int i = 0;

        while(true){
            a = MouseInfo.getPointerInfo();
            b = a.getLocation();
            x = (int) b.getX();
            y = (int) b.getY();
            i+=1;
            color = myRobot.getPixelColor(x, y);
            if(color.getRed() == 43 && color.getGreen() == 47 && color.getBlue() == 62){
                System.out.println(i);
            }
        }

    }
}
