import static java.lang.String.format;

public class Build {
    public static void main(String[] args) {
        Candy candy = new Candy("Конфетка", 22.0, 13.0);
        Chocolate chocolate = new Chocolate("Шоколадка", 41.5, 125.7);
        Toffee toffee = new Toffee("Ириски", 5.2, 7.2);
        Souvenir[] souvenirs = {candy, chocolate, toffee};
        for (Souvenir souvenir : souvenirs) {
            System.out.println(souvenir.getName());
            System.out.println(format("Цена: %s", souvenir.getPrice()));
            System.out.println(format("Вес: %s", souvenir.getWeight()));
            if(souvenir ==candy){System.out.println(candy.getComposition());}
            if(souvenir ==chocolate){System.out.println(chocolate.getComposition1());}
            if(souvenir ==toffee){System.out.println(toffee.getComposition2());}
            souvenir.manufacturer();
            System.out.println("--------------------------------");


        }
        summ(souvenirs);
    }

    public static void summ(Souvenir[] souvenirs) {
        int sumWeight = 0;
        int sumPrice = 0;
        for (Souvenir souvenir : souvenirs) {
            sumWeight += souvenir.getWeight();
            sumPrice += souvenir.getPrice();
        }
        System.out.println(format("Вес подарка: %s", sumWeight));
        System.out.println(format("Цена подарка: %s", sumPrice));
    }
}
