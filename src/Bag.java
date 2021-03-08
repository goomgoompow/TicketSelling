public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    //contructor
    public Bag( Invitation invitation, Long amount) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Bag(Long amount) {
        this.amount = amount;
    }

    public boolean hasInvitation(){
        return invitation!=null;
    }

    public boolean hasTicket(){
        return ticket!=null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
