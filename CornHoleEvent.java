package Project2;

public class CornHoleEvent extends Event {
    int numBeanBags;
      public CornHoleEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance,int numBeanBags){
          super(name, playTo, isPlayedToExact, PlayDistance);
          this.numBeanBags=numBeanBags;
      }

    public String getExtraInfo() {
        return "\nNumber of Bean Bags: " +numBeanBags;
    }

    public CornHoleEvent eventClone(){
        return new CornHoleEvent(name, playTo, isPlayedToExact, PlayDistance, numBeanBags);
    }
}

