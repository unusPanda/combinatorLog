package Combinator;

import base.Logger;

import java.io.PrintWriter;

public class JaskellExceptionLogger implements Logger {
    private final PrintWriter out;
    private final Logger logger;

    public void print(int level, String msg) {

    }

    public void println(int level, String msg) {
        logger.println(level, msg);
    }

    // todo 需要重新检查
    public void printException(Throwable e) {
        if (e instanceof JaskellException) {
            ((JaskellException) e).printExecutionTrace(out);
        } else {
            logger.printException(e);
        }
    }

    public JaskellExceptionLogger(PrintWriter printWriter, Logger logger) {
        this.out = printWriter;
        this.logger = logger;
    }
}
