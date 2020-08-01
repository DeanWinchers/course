public class CLH{
    boolean isLocked(){
        if(tail == null){
            return false;
        }
        else{
            return tail.locked.get();
        }
    }
}