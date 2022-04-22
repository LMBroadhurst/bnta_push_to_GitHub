package _7_facebook_oop.subpackage;

import _7_facebook_oop.ServiceCode_Facebook;

public class ClientCode {

    public static void main(String[] args) {

        ServiceCode_Facebook facebookAccountOne = new ServiceCode_Facebook();


        String name = facebookAccountOne.name;
        name = "Lewis";
        facebookAccountOne.openAccount();

        System.out.println(facebookAccountOne.postStatus());

    }

}
