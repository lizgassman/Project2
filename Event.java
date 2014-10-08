package Project2;

public abstract class Event {
    String name;
    int playTo;
    boolean isPlayedToExact;
    int PlayDistance;

    public abstract String getExtraInfo();

    public abstract Event eventClone();

    public String getInfo(){
       return "Name: " + name + "\nplayTo: " + playTo + "\nisPlayedToExact: " + isPlayedToExact + "\nPlayDistance: " + PlayDistance;
    }
    public Event(){
        this.name="";
        this.playTo=0;
        this.isPlayedToExact=false;
        this.PlayDistance=0;

    }


    public Event(String name, int playTo, boolean isPlayedToExact, int PlayDistance){
        this.name=name;
        this.playTo=playTo;
        this.isPlayedToExact=isPlayedToExact;
        this.PlayDistance=PlayDistance;
    }
}













