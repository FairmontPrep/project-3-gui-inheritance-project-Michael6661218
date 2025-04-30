import java.util.Random;

public class FlashDirection extends Flash {
    protected String direction;

    public FlashDirection() {
        super();
        Random rand = new Random();
        if (rand.nextBoolean()) {
            direction = "left";
        } else {
            direction = "right";
        }
        this.description += "Flash thrown to the " + direction + ". ";
    }

    public String getDirection() {
        return direction;
    }
}
