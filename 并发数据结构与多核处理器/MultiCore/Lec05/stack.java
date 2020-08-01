public class StackConsensus<T>{
    private static final int WIN = 0;
    private static final int LOSE = 1;
    Stack s;
    public StackConsensus(){
        s = new Stack();
        s.push(WIN);
        s.push(LOSE);
    }

    public T decide(T value){
        propose(value);
        int status = s.pop();
        int i = ThreadID.get();
        if (status == WIN)
            return proposed[i];
        else
            return proposed[1-i];
    }
}