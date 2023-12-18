package HomeWork;

public class Wallet {


    String owner;
    String manafacturer;

    Money money;

    public Wallet(String owner, String manafacturer,Money money){
        this.owner=owner;
        this.manafacturer=manafacturer;
        this.money=money;
    }


    public String toString(){
        return owner+", кошелек от  "+manafacturer+", в кошельке "+money;
    }

}
