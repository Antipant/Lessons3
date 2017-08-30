public class Candy extends Souvenir {
    private String Composition;
    public void setComposition(String composition){Composition=composition;}
    public String getComposition(){return Composition="Вишня, Карамель!";}

    public Candy(String name, Double Price, Double Weight) {
        super(name, Price, Weight);
    }

    @Override
    public void manufacturer() {
        System.out.println("Красный Октябрь!");
    }
}
