package Practise.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
            public static Map<Integer,Integer>  count(List<Integer> list){
                Map<Integer,Integer> map=new HashMap<>();
                for (int e : list){
                    map.compute(e,(k,v)->(v==null)? 1:v+1);
                }
            return map;
            }

    public static void main(String[] args) {
     //Usuwanie duplikatów z listy:
        // Napisz program, który usuwa wszystkie duplikaty z listy liczb całkowitych.

        /*  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1, 4);
       List<Integer> unique= list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);*/
     //Zliczanie wystąpień elementów w liście:
        // Napisz program, który zlicza, ile razy każdy element występuje w liście liczb całkowitych.
        //System.out.println(count(list));

        //Sortowanie listy: Napisz program, który sortuje listę ciągów znaków alfabetycznie.

        /* List<Character> list=new ArrayList<>(Arrays.asList('z','b','g','s','a'));
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if(o1>o2) return 1;
                if (o1==o2) return 0;
                return -1;
            }
        });
        System.out.println(list);
        */

        //Zmiana wielkości liter w liście: Napisz program, który zmienia wielkość liter w liście ciągów znaków na małe.

        /*   List<Character> list=new ArrayList<>(Arrays.asList('Z','B','G','S','A'));
        list =list.stream().map(Character::toLowerCase).collect(Collectors.toList());
        System.out.println(list);
*/
        //Łączenie dwóch list: Napisz program, który łączy dwie listy liczb całkowitych w jedną listę.
      /*  List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 2, 1, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 22, 11, 44));
        List<Integer> list=new ArrayList<>(list1);
        list.addAll(list2);
        System.out.println(list);*/

        //Usuwanie elementów ze zbioru:
        // Napisz program, który usuwa określony element ze zbioru ciągów znaków.
    /*  Set<String> set=new HashSet<>(Set.of("jabłko","banan","pomarańcza","gruszka"));
            set.remove("banan");
        System.out.println(set);*/

        //Wyszukiwanie elementu w liście:
        // Napisz program, który sprawdza, czy określony element znajduje się w liście liczb całkowitych.
        /*List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 22, 11, 44));
        System.out.println(list.contains(22));*/

        //Odwracanie kolejności elementów w liście:
        // Napisz program, który odwraca kolejność elementów w liście liczb całkowitych.
       /* List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 22, 11, 44));
        System.out.println(list.reversed());*/

        //Obliczanie sumy elementów w liście:
        // Napisz program, który oblicza sumę wszystkich elementów w liście liczb całkowitych.
       /* List<Integer> list = new ArrayList<>(Arrays.asList(11, 22, 33, 44, 55, 66, 22, 11, 44));
        int sum=list.stream().reduce(Integer::sum).orElseThrow();
        System.out.println(sum);*/




            }
}

