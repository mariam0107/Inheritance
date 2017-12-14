package oct11_2017_inheritance;

import java.util.ArrayList;

public class ElectronicShop {

    ArrayList<Device> typeOfDevice = new ArrayList<>();

    public void addDevices(Device d) {
        typeOfDevice.add(d);

    }

    public void removeDevices(Device d) {
        typeOfDevice.remove(d);
    }

    public void showWholeList() {
        for (Device device : typeOfDevice) {
            if (device instanceof Computer) {
                System.out.println((Computer) device);
            } else if (device instanceof Mobile) {
                System.out.println((Mobile) device);
            } else if (device instanceof Tv) {
                System.out.println((Tv) device);
            }
        }
    }

    public void showListId(int id) {
        for (Device device : typeOfDevice) {
            if (device.getDeviceId() == id) {
                if (device instanceof Computer) {
                    System.out.println((Computer) device);
                } else if (device instanceof Mobile) {
                    System.out.println((Mobile) device);
                } else {
                    System.out.println((Tv) device);
                }
            }

        }

    }

    public void showGroup(String str) {
        if (str.equalsIgnoreCase("tv")) {
            for (Device device : typeOfDevice) {
                if (device instanceof Tv) {
                    System.out.println((Tv) device);
                }
            }
        } else if (str.equalsIgnoreCase("mobile")) {
            for (Device device : typeOfDevice) {
                if (device instanceof Mobile) {
                    System.out.println((Mobile) device);
                }
            }
        } else {
            for (Device device : typeOfDevice) {
                if (device instanceof Computer) {
                    System.out.println((Computer) device);
                }
            }
        }
    }
//    public void showListOffers()
//    {
//        for (Device device : typeOfDevice) 
//            System.out.println(device.discount());
//                
//        }
//    }

    public void showListOffers() {
        for (Device device : typeOfDevice) {
            if (device instanceof Computer) {
                System.out.println(((Computer) device).discount());
            } else if (device instanceof Mobile) {
                System.out.println(((Mobile) device).discount());
            } else {
                System.out.println(((Tv) device).discount());
            }

        }
    }
}
