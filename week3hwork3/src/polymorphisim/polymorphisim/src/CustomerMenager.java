public class CustomerMenager{
    private BaseLogger logger;
    public CustomerMenager(BaseLogger logger){
        this.logger=logger;
    }
        public void add (){
            System.out.println("Müşteri Eklendi");
        this.logger.Log("Log mesajı");

        }
    }
