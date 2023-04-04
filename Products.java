import java.text.NumberFormat;
import java.util.Locale;

public class Products {
    //attributes
    int productID;
    String name;
    double unit_price;
    int quantity_on_hand;
    //constructors
    public Products(int id, String name, double price, int quantity)
    {
        setID(id);
        setName(name);
        setUnit_price(price);
        setQuantity_on_hand(quantity);
    }
    //mutators
    public void setID(int id)
    {
        productID = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setUnit_price(double price)
    {
        unit_price = price;
    }
    public void setQuantity_on_hand(int quantity)
    {
        quantity_on_hand = quantity;
    }
    //accessors
    public int getProductID(){
        return productID;
    }
    public String getName(){
        return name;
    }
    public double getUnit_price(){
        return unit_price;
    }
    public int getQuantity_on_hand(){
        return  quantity_on_hand;
    }

    //toString()
    public String toString(){
        return "Product ID: " + productID +"\n" +
               "Product Name: " + name + "\n" +
               "Quantity on Hand = " + quantity_on_hand + "\n" +
               "Unit Price = " + NumberFormat.getCurrencyInstance(Locale.US).format(unit_price);
    }
    //equals()
    public boolean equals(Object o)
    {
        if (!(o instanceof Products))
            return false;
        else {
            Products productsObject = (Products) o;
            return (productID == productsObject.productID && name.equals(productsObject.name)
            && unit_price == productsObject.unit_price && quantity_on_hand == productsObject.quantity_on_hand);
        }
    }

}
