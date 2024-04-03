package Practise.Compare;

public enum Week {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

}
class Main{
    public static void printNum(Week day){
        System.out.println(day.ordinal());
    }
    public static void printName(Week day){
        System.out.println(day.name());
    }

    public static void main(String[] args) {
        printName(Week.THURSDAY);
        printNum(Week.MONDAY);
    }
}
