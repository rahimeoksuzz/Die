import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {
    /**"Roll or Hold?" It takes the decision of the user by asking
    */
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls){
        System.out.println("Roll or Hold?");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){ 
            String done = sc.nextLine(); //indicates whether to continue or not
            if(done.length() == 0){
                return true;
            }
            else{
                return false;
            } 
        }
        sc.close();
        return false;
    }

}
