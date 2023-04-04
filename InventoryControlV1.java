public class InventoryControlV1 {
    public static void main(String[] args) {

        Products p1 = new Products(19, "Engine", 2300, 3);
        Products p2 = new Products(13, "Belt", 25, 33);
        Products p3 = new Products(5, "Transmission", 1500, 2);

        ProductsLinkedList myList = new ProductsLinkedList();

        myList.insert(p1);
        myList.insert(p2);
        myList.insert(p3);

        System.out.println(myList);





    }
}
