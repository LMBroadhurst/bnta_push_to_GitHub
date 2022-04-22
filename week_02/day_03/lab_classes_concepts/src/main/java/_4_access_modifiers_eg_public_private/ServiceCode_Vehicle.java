package _4_access_modifiers_eg_public_private;

public class ServiceCode_Vehicle {

//    uml diagrams

    /*
        + - - - - - - - - - - - - - - +
        | Vehicle                     |  <- name of the class
        + - - - - - - - - - - - - - - +
        | kind: String                |  <- properties section/name
        + - - - - - - - - - - - - - - +
        | startEngine(): void         |  <- methods section/return type
        + - - - - - - - - - - - - - - +
     */

    /*

    + public
    # protected
    ~ default (private package)
    - private

     */


    public String kind = "A hardcoded value of the 'kind' property.";

    public void startEngine() {
        System.out.println("The engine has started!");
    }

}
