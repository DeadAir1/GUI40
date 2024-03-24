package GUI_3.Zadanie4;

public class Main {
    static  Flyable  shortest(Flyable[] flyable) {
        for (int i = 0; i < flyable.length-1; i++) {
            for (int j = i; j < flyable.length ; j++) {
                if(flyable[i].distance()>flyable[j].distance()){
                    var a=flyable[i];
                    flyable[i]=flyable[j];
                    flyable[j]=a;
                }
            }
        }
        return flyable[0];
    }
    static Speakable loudest(Speakable[] speakables){
        for (int i = 0; i < speakables.length-1; i++) {
            for (int j = i; j < speakables.length; j++) {
                if(speakables[i].speak().length()<speakables[j].speak().length()){
                    var a=speakables[i];
                    speakables[i]=speakables[j];
                    speakables[j]=a;
                }
            }
        }
    return speakables[0];
    }
    public static void main(String[] args) {
        Flyable[] flyablesObjects=new Flyable[5];
        Speakable[] speakablesObjects=new Speakable[3];
        flyablesObjects[0]=new Bird();
        flyablesObjects[1]=new Plane();
        flyablesObjects[2]=new UFO();
        flyablesObjects[3]=new Virus();
        flyablesObjects[4]=Flyable.hybrid(flyablesObjects[0],flyablesObjects[1]);
        speakablesObjects[0]= ()-> "Car,car i wanna car";
        speakablesObjects[1]=new Plane();
        speakablesObjects[2]=new Speakable() {
            @Override
            public String speak() {
                return "Let's dance everybody";
            }
            public String toString(){
                return "I am UFO";
            }
        };
        System.out.println(loudest(speakablesObjects));
        System.out.println(shortest(flyablesObjects));

    }

}
