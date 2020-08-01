public class QueueConsensus<T>{
    Queue q;
    public QueueConsensus(){
        q = new Queue();
    }

    public T decide(T value){
        propose(value);
        q.enq(ThreadID.get());
        if(ThreadID.get() == q.peek())
            return proposed[ThreadID.get()];
        else
            return proposed[q.peek()];
    }
}