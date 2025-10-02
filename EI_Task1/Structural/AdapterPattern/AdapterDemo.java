public class AdapterDemo {
    public static void main(String[] args) {
        USB usbCable = new USB();
        MicroUSB adapter = new USBtoMicroUSBAdapter(usbCable);

        adapter.connectWithMicroUSB();
    }
}
