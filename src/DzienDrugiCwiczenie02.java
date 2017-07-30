public class DzienDrugiCwiczenie02
{
    public static void main(String[] args)
    {
        int liczbaA=20, liczbaB=4, wynik1, wynik2;
        System.out.println("Mamy dwie liczby:");
        System.out.println("Liczba A: "+liczbaA);
        System.out.println("Liczba B: "+liczbaB);
        wynik1=liczbaA/liczbaB;
        System.out.println("Podzielimy liczbą A przez liczbę B: "+wynik1);
        wynik2=liczbaB%liczbaA;
        System.out.println("Reszta z dzielenia liczby B przez liczbą A: "+wynik2);
        System.out.println(+wynik1+"\t"+wynik2);
    }
}
