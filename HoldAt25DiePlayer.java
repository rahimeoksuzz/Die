public class HoldAt25DiePlayer implements DiePlayer {
    /**The game continues until the round score is 25 or higher. We play as long as it's less than 20
    */
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
        if(turnTotal < 25){
            return true;
        }  
        else{
           return false;
        }    
    }
}
