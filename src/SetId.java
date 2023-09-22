import java.util.concurrent.atomic.AtomicInteger;

public class SetId {
    private static AtomicInteger id = new AtomicInteger(0);

    public int setId(){
        return id.getAndIncrement();
    }

}
