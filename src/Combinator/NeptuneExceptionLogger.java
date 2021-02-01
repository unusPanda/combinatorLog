package Combinator;

import base.Logger;

import java.io.PrintWriter;

public class NeptuneExceptionLogger implements Logger {
    private final PrintWriter out;
    private final Logger logger;

    public void print(int level, String msg) {
        logger.print(level, msg);
    }

    public void println(int level, String msg) {
        logger.println(level, msg);
    }

    public void printException(Throwable e) {
        if (e instanceof NeptuneException) {
            ((NeptuneException) e).printExecutionTrace(out);
        } else {
            logger.printException(e);
        }
    }

    public NeptuneExceptionLogger(PrintWriter printWriter, Logger logger) {
        this.out = printWriter;
        this.logger = logger;
    }
}
