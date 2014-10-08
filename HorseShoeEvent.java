package Project2;

public class HorseShoeEvent extends Event {

    int numHorseShoes;

   public HorseShoeEvent(String name, int playTo, boolean isPlayedToExact, int PlayDistance, int numHorseShoes){
       super(name, playTo, isPlayedToExact, PlayDistance);
       this.numHorseShoes=numHorseShoes;
   }

    public String getExtraInfo() {
        return "\nNumber of Horseshoes: " + numHorseShoes;
    }

    public HorseShoeEvent eventClone(){
        return new HorseShoeEvent(name, playTo, isPlayedToExact, PlayDistance, numHorseShoes);
    }
}
