package Combinator;

import base.Logger;

public class SequenceLogger implements Logger {
    private final Logger[] loggers;

    public void print(int level, String msg) {
        for (Logger logger : loggers) {
            logger.print(level, msg);
        }
    }

    public void println(int level, String msg) {
        for (Logger logger : loggers) {
            logger.println(level, msg);
        }
    }

    public void printException(Throwable e) {
        for (Logger logger : loggers) {
            logger.printException(e);
        }
    }

    public SequenceLogger(Logger[] loggers) {
        this.loggers = loggers;
    }
}
