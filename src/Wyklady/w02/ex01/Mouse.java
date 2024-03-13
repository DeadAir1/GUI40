package Wyklady.w02.ex01;
public
    class Mouse
    implements USB {

    @Override
    public void send(byte[] data) {
        System.out.println("Mouse: connected");
    }

    @Override
    public byte[] receive() {
        return new byte[]{120, 87};
    }
}
