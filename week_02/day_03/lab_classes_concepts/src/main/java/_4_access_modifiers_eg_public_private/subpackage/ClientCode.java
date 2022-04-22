package _4_access_modifiers_eg_public_private.subpackage;

import _4_access_modifiers_eg_public_private.ServiceCode_Vehicle;

public class ClientCode {

    public static void main(String[] args) {

//        Client code creates objects and uses its methods / properties

        ServiceCode_Vehicle serviceCodeVehicle = new ServiceCode_Vehicle();
        serviceCodeVehicle.startEngine();
        String kind = serviceCodeVehicle.kind;
        System.out.println(kind);

        serviceCodeVehicle.startEngine();
        
    }

}
