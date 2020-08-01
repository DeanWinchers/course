public class MCS{
    boolean isLocked(){
        if(tail == null){
            return false;
        }
        if(tail.get().locked == true){
            return true;
        }
        return false;
    }
}