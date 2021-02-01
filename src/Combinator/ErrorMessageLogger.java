package Combinator;

import base.Logger;

import java.io.PrintWriter;

public class ErrorMessageLogger implements Logger {
    private final PrintWriter out;
    private final Logger logger;

    public void print(int level, String msg) {
        logger.print(level, msg);
    }

    public void println(int level, String msg) {
        logger.println(level, msg);
    }

    public void printException(Throwable e) {
        out.println(e.getMessage());
    }

    public ErrorMessageLogger(PrintWriter printWriter, Logger logger) {
        this.out = printWriter;
        this.logger = logger;
    }
}
