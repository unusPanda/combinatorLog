public class SimpleLoggerImpl implements SimpleLogger{
    public void print(int level, String msg) {
        System.out.println(msg);
    }

    public void println(int level, String msg) {
        System.out.println(msg);
    }

    public void logException(Throwable e) {
        e.printStackTrace();
    }
}
