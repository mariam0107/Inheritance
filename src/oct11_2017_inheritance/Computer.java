
package oct11_2017_inheritance;


public class Computer extends Device {
    private ComputerOs computeros;

    public Computer(ComputerOs computeros, int deviceId, double price, int processor) {
        super(deviceId, price, processor);
        this.computeros = computeros;
    }

    public ComputerOs getComputeros() {
        return computeros;
    }

    public void setComputeros(ComputerOs computeros) {
        this.computeros = computeros;
    }
    public double discount()
    {
       double d= this.getPrice()*0.105;
        return (this.getPrice()-d);
    }

    @Override
    public String toString() {
        return "\nTHE Computer OS is:  "+this.getComputeros()+"  "+super.toString();
    }
    
    
}
