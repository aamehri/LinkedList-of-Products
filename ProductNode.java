public class ProductNode {
    //attributes
    private Products product;
    private ProductNode next;

    //constructors
    public ProductNode()  //default constructor
    {
        product = null;
        next = null;
    }
    public ProductNode(Products product)
    {
        setProduct(product);
        next = null;
    }
    //mutators
    public ProductNode setProduct(Products product)
    {
        this.product = product;
        return this;
    }
    public ProductNode setNext(ProductNode next){
        this.next = next;
        return this;
    }
    //accessors
    public Products getProduct(){
        return product;
    }
    public ProductNode getNext(){
        return next;
    }

}
