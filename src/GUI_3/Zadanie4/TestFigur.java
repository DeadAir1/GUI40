package GUI_3.Zadanie4;

import java.util.Arrays;

public class TestFigur {
    public static void main(String[] args)
    {
        Figura fig[] = new Figura[4];
        fig[0] = new Kolo(10, 10, 5);                    // położenie koła = srodek = (10,10), promień = 5
        fig[1] = new Prostokat(20, 20, 15, 10);
        fig[2]=new Prostokat(10,20,30,40);
        fig[3]=new Kolo(20,50,20);
        // położenie prostokąta = lewy górny wierzchołek = (20,20), szerokość = 15, wysokość = 10

        // polimorficzne wywołanie metody toString() z klas Kolo/Prostokat,
        // a nie z klasy Figura
        for (Figura f : fig)              // pętla for-each
            System.out.println(f);    // System.out.println(f.toString());

        fig[0].pozycja(12, 12);
        fig[1].pozycja(25, 30);
        System.out.println(Arrays.toString(fig));
        System.out.println("====================");
        Arrays.sort(fig);
        System.out.println(Arrays.toString(fig));

    }
}
