
package oct11_2017_inheritance;

import java.util.Scanner;


public class WebShop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ElectronicShop e=new ElectronicShop();
        Computer c1=new Computer(ComputerOs.WINDOWS,1,5000,11);
        Computer c2=new Computer(ComputerOs.OS,2,4000,12);
        Computer c3=new Computer(ComputerOs.LINUX,3,3000,11);
        Computer c4=new Computer(ComputerOs.SUN,4,2000,12);
        
        Mobile m1=new Mobile(MobileOs.ANDROID,"Comviq",5,2000,12);
        Mobile m2=new Mobile(MobileOs.IOS,"Tele2",6,3000,13);
        Mobile m3=new Mobile(MobileOs.BLACKBERG,"Lyca",7,4000,12);
        
        Tv t1=new Tv(20,8,25000,11);
        Tv t2=new Tv(30,9,35000,13);
        System.out.println("ADDING ITEMS..........");
        System.out.println("***************************");

        e.addDevices(c1);
        e.addDevices(c2);
        e.addDevices(c3);
        e.addDevices(c4);
        
        e.addDevices(m1);
        e.addDevices(m2);
        e.addDevices(m3);
        
        e.addDevices(t1);
        e.addDevices(t2);
        
        
        
        
        System.out.println("displaying whole list..........");
        System.out.println("*******************************");
        e.showWholeList();
        
        System.out.println("displaying item based on the listid..........");
        System.out.println("*****************************************************");
        e.showListId(4);
        
        System.out.println("displaying whole list discounted price ..........");
        System.out.println("*****************************************************");
        e.showListOffers();
        
        System.out.println("ENTER THE GROUP NAME(Tv,mobile,computer)");
        String str=sc.nextLine();        e.showGroup(str);
        
        System.out.println("removing the given item from list..........");
        e.removeDevices(c4);
        
        e.showWholeList();
        
        
        
    }
    
}
