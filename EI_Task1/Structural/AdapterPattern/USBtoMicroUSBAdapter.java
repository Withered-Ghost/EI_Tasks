public class USBtoMicroUSBAdapter implements MicroUSB {
    private USB usb;

    public USBtoMicroUSBAdapter(USB usb) {
        this.usb = usb;
    }

    @Override
    public void connectWithMicroUSB() {
        System.out.print("Adapter converts MicroUSB request -> ");
        usb.connectWithUSB();
    }
}
