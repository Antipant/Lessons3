public class Toffee extends Souvenir {
    private String Composition2;
    public void setComposition2(String composition2){Composition2=composition2;}
    public String getComposition2(){return Composition2="Сахар!";}
    public Toffee(String name, Double Price, Double Weight) {
        super(name, Price, Weight);
    }

    @Override
    public void manufacturer() {
        System.out.println("Ирис-кис-кис!");
    }
}