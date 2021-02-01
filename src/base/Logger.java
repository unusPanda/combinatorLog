package base;

public interface Logger {
    void print(int level, String msg);

    void println(int level, String msg);

    void printException(Throwable e);
}
