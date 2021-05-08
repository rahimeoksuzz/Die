public class HoldAt20DiePlayer implements DiePlayer {
    /*The game continues until the round score is 20 or higher. We play as long as it's less than 20
    */
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
        if(turnTotal < 20){
            return true;
        }  
        else{
           return false;
 
        }    

    }
}
