package Combinator;

import base.Logger;

import java.util.Date;

import static javax.security.auth.callback.ConfirmationCallback.ERROR;

public class TimestampLogger implements Logger {
    private final Logger logger;
    private boolean freshline = true;

    private void printTimestamp(int level) {
        if (freshline) {
            logger.print(level, new Date().toString() + ": ");
        }
    }

    public void print(int level, String msg) {
        printTimestamp(level);
        logger.print(level, msg);
        freshline = false;
    }

    public void println(int level, String msg) {
        printTimestamp(level);
        logger.println(level, msg);
        freshline = true;
    }

    public void printException(Throwable e) {
        printTimestamp(ERROR);
        logger.printException(e);
        freshline = true;
    }

    public TimestampLogger(Logger logger) {
        this.logger = logger;
    }
}
