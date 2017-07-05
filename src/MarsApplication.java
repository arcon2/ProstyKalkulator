/**
 * Created by Arcon on 2017-06-24.
 */
public class MarsApplication
{
    public static void main(String[] args)
    {
        MarsRobot spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "Eksplatacja";
        spirit.status = "Eksploracja";

        opportunity.speed=3;
        spirit.speed =2;

        spirit.temperature=-60;
        opportunity.temperature=-66;

        opportunity.showAttributes();
        spirit.showAttributes();

        System.out.println("Zwiększ prędkość do 3");
        spirit.speed=3;
        opportunity.speed=4;

        System.out.println("Zwiększono prędkość do "+spirit.speed);
        spirit.showAttributes();
        opportunity.showAttributes();

        System.out.println("Zmiana tem na -90");
        spirit.temperature=-90;
        opportunity.temperature=-80;

        spirit.showAttributes();
        opportunity.showAttributes();

        System.out.println("Sprawdzanie tem");
        spirit.checkTemperature();
        opportunity.checkTemperature();
        spirit.showAttributes();
        opportunity.showAttributes();
    }
}