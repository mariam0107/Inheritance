
package oct11_2017_inheritance;


public class Mobile extends Device {
    private MobileOs mos;
    private String OperatorName;

    public Mobile(MobileOs mos, String OperatorName, int deviceId, double price, int processor) {
        super(deviceId, price, processor);
        this.mos = mos;
        this.OperatorName = OperatorName;
    }

    public MobileOs getMos() {
        return mos;
    }

    public void setMos(MobileOs mos) {
        this.mos = mos;
    }

    public String getOperatorName() {
        return OperatorName;
    }

    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }
    
    public double discount()
    {
        double d=(this.getPrice()*0.55);
        return (this.getPrice()-d);
    }

    @Override
    public String toString() {
        return "\n MOBILE OS "+this.getMos()+" MOBILE OPERATOR NAME IS: "+this.getOperatorName()+" "+super.toString();
    }
    
    
}
