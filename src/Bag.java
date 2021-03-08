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

    private boolean hasInvitation(){
        return invitation!=null;
    }

    public boolean hasTicket(){
        return ticket!=null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }

    public long hold(Ticket ticket){
        setTicket(ticket);
        if(hasInvitation()){
            return 0L;
        }else{
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
