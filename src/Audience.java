public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /*public Bag getBag() {
        return bag;
    }*/

    public Long buy(Ticket ticket){
        long result;
        if(!bag.hasInvitation()){
            bag.minusAmount(ticket.getFee());
            result = 0L;
        }else{
            result = ticket.getFee();
        }
        bag.setTicket(ticket);
        return  result;
    }
}
