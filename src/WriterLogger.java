import java.io.PrintWriter;

public class WriterLogger implements Logger {
    private final PrintWriter writer;

    public void println(int level, String msg) {
        writer.println();
    }

    public void logException(Throwable e) {
        e.printStackTrace(writer);
    }

    WriterLogger(PrintWriter writer) {
        this.writer = writer;
    }
}
