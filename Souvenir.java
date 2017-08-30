public abstract class Souvenir {
    private Double Price;
    private Double Weight;
    private String name;

    public Souvenir() {
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }

    public Double getPrice() {

        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getName() {

        return name;
    }

    public Souvenir(String name, Double Price, Double Weight) {
        this.Price = Price;
        this.Weight = Weight;
        this.name = name;

    }

    public abstract void manufacturer();
}
