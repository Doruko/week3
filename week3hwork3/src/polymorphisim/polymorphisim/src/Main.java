public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConseleLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log mesajı");
//        }

        CustomerMenager customerMenager = new CustomerMenager(new FileLogger());
        customerMenager.add();
    }
}