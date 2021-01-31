public interface SimpleLogger {
    void print(int level, String msg);;
    void println(int level, String msg);;
    void logException(Throwable e);;
}
