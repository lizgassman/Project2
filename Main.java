package Project2;

public class Main {

    public static void main(String[]args){
        System.out.println("Lawn Games");

    if (args[0].equals("events")) {
        EventManager proj2 = new EventManager();

        Event[] eventArray = proj2.getEvents();

        for (int i = 0; i < eventArray.length; i++) {
            System.out.println(eventArray[i].getInfo() + eventArray[i].getExtraInfo() + "\n");
        }

     }
       else if(args[0].equals("olympians")){

        OlympianManager proj3 = new OlympianManager();

        Object[] olympArray = proj3.getOlympians();


    }
       else if(args[0].equals("help")){
        System.out.println("Enter either the command event or olympians. Events command will display the days events and olympians will display the days olympians' name, sex and age. ");
      }

        else {

         System.out.println("Argument is invalid.  Only events, e, olympians, o, help, or h are accepted.");
      }
    }

}
