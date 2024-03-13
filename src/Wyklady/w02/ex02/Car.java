package Wyklady.w02.ex02;

public
    class Car
    implements Vehicle{

    private int dist;

    public Car() {
        this.dist = 0;
    }

    @Override
    public void startEngine() {
        if(checkEngine())
            System.out.println("pora sprawdzic silnik");
    }

    @Override
    public void move() {
        dist++;
    }

    @Override
    public int getDistance() {
        return dist;
    }
}
