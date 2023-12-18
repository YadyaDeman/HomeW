package HomeWork;

public class Money {

    int cent;
    int euro;

    public Money(int cent, int euro){
        this.cent=cent;
        this.euro=euro;
    }


    public String toString(){
        return euro+ " и, "+cent+ " центов";
    }

}
