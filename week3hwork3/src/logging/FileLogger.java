package logging;

public class FileLogger implements Logger, java.lang.System.Logger {
    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandi :" + data);
    }
}