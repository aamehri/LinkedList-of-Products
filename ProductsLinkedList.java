public class ProductsLinkedList {

    //managing the list
    //attributes
    private ProductNode head;
    private int numberOfParts;

    //constructor
    public ProductsLinkedList(){
        head = null;
        numberOfParts = 0;
    }
    //mutators
    //insert method
    public void insert(Products product)
    {
        ProductNode pn = new ProductNode(product);
        pn.setNext(head);
        head = pn;
        numberOfParts++;
    }

    //accessors
    public int getNumberOfParts() {
        return numberOfParts;
    }
    public boolean isEmpty(){
        return  (numberOfParts == 0);
    }

    //toString()
    public String toString(){
        String myString = "";
        ProductNode current = head;

        while (current != null) {
            myString += current.getProduct() + "\n";
            current = current.getNext();
        }

        return myString;
    }
}
