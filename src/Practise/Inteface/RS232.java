package Practise.Inteface;

public class RS232 implements Port {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public byte[] receive() {
        return new byte[0];
    }

    @Override
    public void send(byte[] data) {

    }
}
