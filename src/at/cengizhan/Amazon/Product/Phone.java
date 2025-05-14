package at.cengizhan.Amazon.Product;

public class Phone implements Product{
    private int ID;
    private int Price;
    private String Titel;
    private String Description;

    public Phone(int ID, int price, String titel, String description) {
        this.ID = ID;
        Price = price;
        Titel = titel;
        Description = description;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public int getPrice() {
        return this.Price;
    }

    @Override
    public String getTitel() {
        return this.Titel;
    }

    @Override
    public String getDescribtion() {
        return this.Description;
    }
}
