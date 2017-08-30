public class Chocolate extends Souvenir {
    private String Composition1;
    public void setComposition1(String composition1){Composition1=composition1;}
    public String getComposition1(){return Composition1="Шоколад!";}
    public Chocolate(String name, Double Price, Double Weight) {
        super(name, Price, Weight);
    }

    @Override
    public void manufacturer() {
        System.out.println("Шоколадная фабрика!");
    }
}
