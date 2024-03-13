package Practise.Inteface;

public interface Port {
    void open();
    void close();
    byte[] receive();
    void send(byte[] data);
}
