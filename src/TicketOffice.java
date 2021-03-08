import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice{
    private Long amount;
    private List<Ticket> tikets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tikets) {
        this.amount = amount;
        this.tikets.addAll(Arrays.asList(tikets));
    }

    public Ticket getTicket(){
        return tikets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
