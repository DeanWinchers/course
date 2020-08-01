import java.util.concurrent.atomic.AtomicBoolean;

public class TAS {
    AtomicBoolean state;
    boolean isLocked(){
        return state.get();
    }
}