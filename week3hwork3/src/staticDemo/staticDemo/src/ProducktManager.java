public class ProducktManager {
    static {
        System.out.println("Static Yapıcı blok çalıştı");
    }
    public void ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    public void add(Product product) {
        ProductValidator validator = new ProductValidator();
        if (validator.isValid(product)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Ürün bilgileri gerçersizdir.");
        }
    }
}