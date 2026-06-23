public class Test {

    public static void main(String[] args) {

        Product[] products = {

                new Product(10, "Keyboard", "Electronics"),
                new Product(11, "Laptop", "Electronics"),
                new Product(13, "T-shirt", "Clothing"),
                new Product(14, "Headphones", "Electronics"),
                new Product(15, "NoteBook", "Stationary")
        };

        int targetId = 14;

        System.out.println("Linear Search:");

        Product result1 =
                LinearSearch.search(products, targetId);

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 =
                BinarySearch.search(products, targetId);

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}