package Wyklady.w02.ex01;

public interface USB {
    void send(byte[] data);
    byte[] receive();

}
