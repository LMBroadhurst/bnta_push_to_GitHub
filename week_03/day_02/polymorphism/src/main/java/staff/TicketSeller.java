package staff;

public class TicketSeller extends Staff implements Seller{

    public TicketSeller(String name) {
        super(name);
    }

//    Behaviours

    @Override
    public String sellTicket() {
        return "Yay, ticket sold.";
    }

    @Override
    public void goHomeAtEndOfDay() {

    }
}
