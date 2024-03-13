package Wyklady.w02.ex02;

public
    interface Vehicle {

    void startEngine();
    void move();
    int getDistance();

    default boolean checkEngine(){
        return getDistance() >= 10000;
    }
}
