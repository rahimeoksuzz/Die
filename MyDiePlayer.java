public class MyDiePlayer implements DiePlayer {
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
        if(turnTotal < 18 + Math.round((maxScore - turnTotal)/5)){
            return true;
        }
        else{
           return false;
       } 
    }
}
