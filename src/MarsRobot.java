/**
 * Created by Arcon on 2017-06-24.
 */
public class MarsRobot
{
    String status;
    int speed;
    float temperature;

    void checkTemperature()
    {
        if(temperature <-80)
        {
            status = "powrot do domu";
            speed = 5;
        }
    }
    void showAttributes()
    {
        System.out.println("Status " + status);
        System.out.println("Prędkość " + speed);
        System.out.println("Temperatura " + temperature);
    }
}
