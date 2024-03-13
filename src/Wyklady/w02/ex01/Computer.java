package Wyklady.w02.ex01;

public
    class Computer {
    public void connect(USB usb){
        usb.send(new byte[]{1});
        byte[] data = usb.receive();
        System.out.println("Device id: " + data[0]);
    }
}
