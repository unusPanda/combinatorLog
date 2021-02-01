package base;

import java.io.PrintWriter;

public class WriterLogger implements Logger {
    private final PrintWriter writer;

    public void print(int level, String msg) {
        writer.print(msg);
    }

    public void println(int level, String msg) {
        writer.println(msg);
    }

    public void printException(Throwable e) {
        e.printStackTrace(writer);
    }

    public WriterLogger(PrintWriter writer) {
        this.writer = writer;
    }
}
