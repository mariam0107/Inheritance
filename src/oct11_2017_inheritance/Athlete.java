/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oct11_2017_inheritance;

/**
 *
 * @author User
 */
public class Athlete extends Person {
   int numberOfMedals;
    public double bonus()
    {
        return numberOfMedals*10000;
    }

    public Athlete(int numberOfMedals,String name,int age,String address) {
        super(name,age,address);
        this.numberOfMedals = numberOfMedals;
    }

    public int getNumberOfMedals() {
        return numberOfMedals;
    }

    public void setNumberOfMedals(int numberOfMedals) {
        this.numberOfMedals = numberOfMedals;
    }
    public String toString()
    {
        return "name"+this.getName()+"Age"+this.getAge()+"Address"+this.getAddress();
    }
    
    
}
