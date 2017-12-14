
package oct11_2017_inheritance;


public class Tv extends Device {
    private double inches;

    public Tv(double inches, int deviceId, double price, int processor) {
        super(deviceId, price, processor);
        this.inches = inches;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "\n Specification of the TV is : "+this.getInches()+" "+super.toString(); 
    }

    @Override
    public double discount() {
        double d=(this.getPrice()*0.2);
        return (this.getPrice()-d);
    }
    
}
