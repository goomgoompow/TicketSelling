public class TicketSeller{
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /*@Deprecated
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
    */
    public void sellTo(Audience audience){
        /*Ticket ticket = ticketOffice.getTicket();
        if (!audience.getBag().hasInvitation()) {
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
        }
        audience.getBag().setTicket(ticket);*/

        //ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
        ticketOffice.sellTicketTo(audience);

    }



}
