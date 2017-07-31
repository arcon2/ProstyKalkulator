public class DzienDrugiCwiczenie01
{
    public static void main(String[] args)
    {
        int wartosc = 14000;
        int wynik;
        System.out.println("Inwestycja warta jest: "+wartosc);
        wynik=(wartosc*40)/100;
        wynik=wynik+wartosc;
        System.out.println("Inwestycja w drugim roku zwiększyła się o 40%: "+wynik);
        wynik=wynik+1500;
        System.out.println("Inwestycja w trzecim roku zwiększyła się o 1500 zł: "+wynik);
        wynik=wynik+((wynik*12)/100);
        System.out.println("Inwestycja w czwartym roku zwiększyła się o 12%: "+wynik);
    }
}
