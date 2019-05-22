import java.util.GregorianCalendar;

public class Schedules {

    private GregorianCalendar start;
    private GregorianCalendar end;

    public Schedules(GregorianCalendar start, GregorianCalendar end) {

        this.start = start;
        this.end = end;
    }

    // Getter
    public GregorianCalendar getStart() {
        return start;
    }

    public GregorianCalendar getEnd() {
        return end;
    }

    // Setter
    public void setStart(GregorianCalendar start) {
        this.start = start;
    }

    public void setEnd(GregorianCalendar end) {
        this.end = end;
    }
}
