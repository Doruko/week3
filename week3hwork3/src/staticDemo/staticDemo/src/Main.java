public class Main {
    public static void main(String[] args) {
        ProducktManager manager = new ProducktManager();
        Product product= new Product();
        product.price =10;
        product.name="Mouse";

        manager.add(product);

        DatabaseHelper.Connection.createConnection();

    }
}
