/**
 * Created by Arcon on 2017-07-14.
 */
public class Weather
{
    public static void main(String[] args)
    {
        float fah=86;
        System.out.println(fah+" stopni Fahrenheita to  ");
        //Aby skonwertowć temperaturę z Fahrenheita
        //na stopnie Celcjusza zacznij od odjącia 32
        fah = fah-32;
        //Podziel przez 9
        fah=fah/9;
        //Pomnóż przez 5
        fah=fah*5;
        System.out.println(fah+" stopni Celcjusza");

        float cel = 33;
        System.out.println(cel+" stopni celcjusza");
        //Aby skonwertować stopnie Celcjusza
        //na stopnie Fahrenheita rozpocznij od pomnożenia przez 9
        cel=cel*9;
        //Podziel odpowiedz przez 5
        cel=cel/5;
        //Dodaj do odpowiedzi 32
        cel=cel+32;
        System.out.println(cel+" stopni Fahrenheita");


    }
}
