package GUI_6.Zadanie14;

import java.awt.font.FontRenderContext;
import java.util.*;
import java.util.stream.Stream;

public class MakeMap  {
    static Map<String,List<Samochod>> autoMap=new HashMap<>();
    static public void addToMap(String[] arr){
        for (int i = 0; i < arr.length; i+=3) {
            autoMap.putIfAbsent(arr[i],new ArrayList<Samochod>());
            autoMap.get(arr[i]).add(new Samochod(arr[i+1],arr[i+2]));
        }
        System.out.println(autoMap.toString());
    }
    static public void getLowestPriceSamochod(){
        Samochod samochod=null;
        for(String key: autoMap.keySet()){
            for (int i = 0; i <autoMap.get(key).size() ; i++) {
                if(samochod==null){
                    samochod=autoMap.get(key).get(i);
                }else{
                    if(Integer.parseInt(autoMap.get(key).get(i).cena)<Integer.parseInt(samochod.cena))
                        samochod=autoMap.get(key).get(i);
                }
            }
        }
        System.out.println(samochod);

            
        }
    }



