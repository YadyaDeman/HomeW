package HomeWork;

public class HomeWork {
    /*Задача 1
С использованием агрегатации (отношения HAS-A) создать классы Кошелек (Wallet) и Деньги (Money).
Вывести на печать несколько объектов класса Wallet*/

    public static void main(String[] args) {

        Money money=new Money(10,250);
        Wallet wallet=new Wallet("Лермонтову","Boss",money);

        Money money1=new Money(45,654);
        Wallet wallet1=new Wallet("Пущкину","Dior",money1);

        System.out.println("Этот кошелёк принадлежит "+ wallet);
        System.out.println("Этот кошелёк принадлежит "+wallet1);
    }

}
