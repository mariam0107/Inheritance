
package oct11_2017_inheritance;

public abstract class Device {
   private static int i;
   private int deviceId;
   private double price;
   private int processor;
   private boolean getDiscount=false;

    public Device(int deviceId, double price, int processor) {
        this.deviceId = deviceId;
        this.price = price;
        this.processor = processor;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Device.i = i;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public boolean isGetDiscount() {
        return getDiscount;
    }

    public void setGetDiscount(boolean getDiscount) {
        this.getDiscount = getDiscount;
    }
    public abstract double discount();

    @Override
    public String toString() {
        return "Device ID is :"+this.getDeviceId()+"Price is :"+this.getPrice()+"Processor :"+this.getProcessor();
    }
   
    
    
}
