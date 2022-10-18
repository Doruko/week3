public class ProductValidator {
    //Bir methodu statik yaptığımızda class ismi ile çağırabiliriz newlememize gerek kalmaz.
    public boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        } else
            return false;
    }

    public void bisey(){

    }

    public class BaskaBirClass{
        public static void Sil(){
            //Ana classlar statik yapılamıyor ama class içinde yeni bir class oluşturduktan sonra statik class yazılabilir. Buna innerclass deniliyor.
            //Innerclass yapımı best practice için çok iyi olmayabiliyor. Sebebi her classın tek bir fonksiyona hizmet etmesi gerektiğinden.
        }
    }
}
