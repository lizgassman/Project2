package Project2;

public class EventManager {

   private static  Event[] eventArray;

   public EventManager(){


       eventArray = new Event[] {

               new CanJamEvent( "CanJam", 0, false, 0, 0),
               new CornHoleEvent("Cornhole", 1, true, 0, 4),
               new HorseShoeEvent("HorseShoes", 0, false, 6, 10),
               new LadderBallEvent("LadderBall", 0, false, 3, 7),
               new StickGameEvent("StickGame", 3, true, 6, 9),
               new WashooEvent("Washoo", 5, false, 8, true, 12)


       };
   }

    public  Event[] getEvents(){

       Event[] returnArray = new Event[eventArray.length];

      for (int i=0; i<eventArray.length; i++) {

          returnArray[i]=eventArray[i].eventClone();

      }
       return returnArray;
    }

}

