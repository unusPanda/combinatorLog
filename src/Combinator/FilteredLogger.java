package Combinator;

import base.Logger;

import static javax.security.auth.callback.ConfirmationCallback.ERROR;

public class FilteredLogger implements Logger {
    private final Logger logger1;
    private final Logger logger2;
    private final int leve;

    public void print(int level, String msg) {
        if (level == leve)
            logger1.print(level, msg);
        else
            logger2.print(level, msg);
    }

    public void println(int level, String msg) {
        if (level == leve)
            logger1.println(level, msg);
        else
            logger2.println(level, msg);
    }

    public void printException(Throwable e) {
        if (leve == ERROR)
            logger1.printException(e);
        else
            logger2.printException(e);
    }

    public FilteredLogger(int leve, Logger logger1, Logger logger2) {
        this.leve = leve;
        this.logger1 = logger1;
        this.logger2 = logger2;
    }
}
