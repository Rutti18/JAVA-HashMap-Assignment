
import java.util.HashMap;

public class IOweYou {

    private HashMap<String, Double> mapOfIOU;

    public IOweYou() {
        this.mapOfIOU = new HashMap<>();
    }

    public void setSum(String toWho, double amount) {

        mapOfIOU.put(toWho, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {

        return mapOfIOU.getOrDefault(toWhom, 0.0);
    }

}