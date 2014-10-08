package Project2;

public class StickGameEvent extends Event {
    int frisbeeSize;

    public StickGameEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance, int frisbeeSize){
        super(name, playTo, isPlayedToExact, PlayDistance);
        this.frisbeeSize=frisbeeSize;

    }

    public String getExtraInfo() {
        return "\nFrisbee size: " + frisbeeSize;
    }

    public StickGameEvent eventClone(){
        return new StickGameEvent(name, playTo, isPlayedToExact, PlayDistance, frisbeeSize);
    }
}
