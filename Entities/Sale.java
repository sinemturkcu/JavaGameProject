package JavaKampı.Homework4_2.Entities;

public class Sale {
    private int saleId;
    private double salePrice;


    public Sale(){

    }

    public Sale(int saleId, double salePrice) {
        this.saleId = saleId;
        this.salePrice = salePrice;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
