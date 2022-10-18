public class CustomerManager {
     ICustomerDal customerDal;
    public CustomerManager(ICustomerDal OracleCustomerDal OracleCustomerDal){
        this.customerDal = customerDal;
    }
    public void Add(){
        //İş kodları yazılır
        customerDal.Add();
    }
}
