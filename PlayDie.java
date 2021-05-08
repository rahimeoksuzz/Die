
/**
* BIL122 - hw - 01
* 
* @author Rahime, <rahimeoksuzz@gmail.com>
*/

public class PlayDie {
    public static void main(String[] args) {
        
        DiePlayer[] players = new DiePlayer[5];

        HoldAt20DiePlayer p1 = new HoldAt20DiePlayer(); 
        HoldAt25DiePlayer p2 = new HoldAt25DiePlayer();
        RaceToGoalDiePlayer p3 = new RaceToGoalDiePlayer(); 
        MyDiePlayer p4 = new MyDiePlayer();
        UserDiePlayer ps = new UserDiePlayer();

        players[0] = p1;
        players[1] = p2;
        players[2] = p3;
        players[3] = p4;
        players[4] = ps;
        
        DieGame game = new DieGame(players);
        int win = game.play();
        System.out.println((win + 1) + ". THE PLAYER WON");
        
        /* //used for statistics
        int win = 0;
        int[] statistics = new int[4];
        for(int i = 0; i < 1000; i++){
            win = game.play();
            statistics[win]++;
            game.setZeroScore();
        }
        for(int i = 0; i < statistics.length; i++ ){
            System.out.println(i + 1 + ". the player " + statistics[i]);
            //System.out.println(i + 1 + ". the rate " + ((double)statistics[i]/1000)*100);
        } */
    }
}
