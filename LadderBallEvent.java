package Project2;

public class LadderBallEvent extends Event{
    int numRings;

    public LadderBallEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance, int numRings){
        super(name, playTo, isPlayedToExact, PlayDistance);
        this.numRings=numRings;
    }

    public String getExtraInfo() {
        return "\nNumber of Rings: " + numRings;
    }

    public LadderBallEvent eventClone(){
        return new LadderBallEvent(name, playTo, isPlayedToExact, PlayDistance, numRings);
    }
}
