// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int bonusStep = 20; // количество рублей для одной бонусной мили
        int ticketPrice = 13_676; // стоимость билета

        int bonus = (ticketPrice / bonusStep); // количество бонусов, начисленных за покупку билета

        System.out.println(bonus);


    }
}