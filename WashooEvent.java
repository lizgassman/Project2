package Project2;


public class WashooEvent extends Event{
    boolean hasAutoWinStick;
    int numWashoos;

    public WashooEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance, boolean hasAutoWinStick, int numWashoos){
        super(name, playTo, isPlayedToExact, PlayDistance);
        this.hasAutoWinStick=hasAutoWinStick;
        this.numWashoos=numWashoos;
    }

    public String getExtraInfo() {
        return "\nHave auto win stick: " + hasAutoWinStick + "\nNumber of Washoos: " + numWashoos;

    }

    public WashooEvent eventClone(){
        return new WashooEvent(name, playTo, isPlayedToExact, PlayDistance, hasAutoWinStick, numWashoos);
    }
}
