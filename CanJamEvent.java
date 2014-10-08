package Project2;

public class CanJamEvent extends Event {

    int frisbeeSize;

      public CanJamEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance, int frisbeeSize){
          super(name, playTo, isPlayedToExact, PlayDistance);
          this.frisbeeSize=frisbeeSize;

      }

    public String getExtraInfo(){
        return "\nFrisbee Size: " + frisbeeSize;
    }

    public CanJamEvent eventClone(){
        return new CanJamEvent(name, playTo, isPlayedToExact, PlayDistance, frisbeeSize);
    }
}

