public class DieGame {

    public static final int GOAL_SCORE = 100; // the goal to be reached,kazanmak icin alinacak skor
    private DiePlayer[] players; // Array of Players
    private int[] scores; //Array of Scores

    public DieGame(DiePlayer[] players){
        this.players = players;
        scores = new int[players.length];
    }
    /**It realizes the play of the player in 1 round.
    */
    public int playTurn(DiePlayer p, int playerNum){
        Die die = new Die();
        int rolls = 0;
        int turnTotal = 0;
        int maxScore = this.getMaxScore();
        
        /**continue until the sum of the round score and the total score is 100 or greater
        */
        while(p.isRolling(playerNum, turnTotal, maxScore, rolls) && playerNum + turnTotal < GOAL_SCORE){
            rolls += 1 ;
            int d = die.nextRoll();
            System.out.println("die : " + d);
            /** When it comes to 1, it gets zero from this round
            */
            if(1 == d){
                turnTotal = 0;
                //System.out.println("total : " + turnTotal);
                return turnTotal;
            }
            turnTotal = turnTotal + d;
        }
        playerNum = playerNum + turnTotal;
        //System.out.println("total : " + turnTotal);
        if(maxScore < playerNum)
        {
            maxScore = playerNum;
        }

        return turnTotal;
    }
    /**Plays 1 round of the game for all players
    */
    public int play(){
        for(int j = this.getMaxScore(); j < GOAL_SCORE; j = this.getMaxScore()){
            for(int i = 0; i < players.length && this.getMaxScore() < GOAL_SCORE; i++){
                System.out.println("PLAYER " + (i + 1) + ": ");
                scores[i] += playTurn(players[i], scores[i]);
            }
            printScores();
        }
        return getMaxScoreIndex();
    }
    /**Returning the maximum score between players
    */
    int getMaxScore(){
        int maxScore = scores[0];
        for(int i = 0; i < scores.length; i++){
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }
    /**help us return the winning player's index in the series
    */
    int getMaxScoreIndex(){
        int index = 0;
        for(int i = 0; i < scores.length; i++){
            if (getMaxScore() <= scores[i]) {
                index = i;
            }
        }
        return index;
    }
    /**It prints the scores of all players.
    */
    void printScores(){
        for(int i = 0; i < players.length; i++ ){
            System.out.println(i + 1 + ". Players Scores : " + scores[i]);
        }
    }
    /**sets the score string to 0 for each game when generating statistics.
    */
    void setZeroScore(){
        for(int i = 0; i < scores.length; i++ ){
            scores[i] = 0;
        }
    }
    
}
