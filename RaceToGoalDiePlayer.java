public class RaceToGoalDiePlayer implements DiePlayer {
    /**If i>=71 or j>=71 ,roll until the turn total is greater than or equal to 21+round((j-i)/8)
    */
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
        if(!(myScore < 71) || !(maxScore < 71)){
            return true;
        }
        else if(turnTotal < 21 + Math.round((maxScore - myScore)/8)){
            return true;
        }
        else{
            return false;
        }
            
    }
}
