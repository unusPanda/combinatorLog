public interface Logger {
    void println(int level, String msg);

    void logException(Throwable e);
}
