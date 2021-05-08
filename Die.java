import java.util.Random;

public class Die {
    
    //(1-6) aralığında rastgele sayı return eder.
    public int nextRoll(){
        Random r = new Random();
        int die =  r.nextInt(6) + 1; //I brought the values ​​0-5 to 1-6
        return die;
    }

}
