import Combinator.*;
import base.Logger;
import base.NopLogger;
import base.WriterLogger;

import java.io.OutputStream;
import java.io.PrintWriter;

public class Loggers {
    static Logger nop() {
        return new NopLogger();
    }

    static Logger writer(PrintWriter writer) {
        return new WriterLogger(writer);
    }

    static Logger writer(OutputStream out) {
        return writer(new PrintWriter(out, true));
    }

    static Logger filter(int lvl, Logger l1, Logger l2) {
        return new FilteredLogger(lvl, l1, l2);
    }

    static Logger ignore(int lvl, Logger l1, Logger l2) {
        return new IgnoringLogger(lvl, l1, l2);
    }

    static Logger timestamp(Logger logger) {
        return new TimestampLogger(logger);
    }

    static Logger sequence(Logger[] loggers) {
        return new SequenceLogger(loggers);
    }

    // todo 此方法目前并不完善
    static Logger file() {
        return new FileLogger();
    }

    static Logger jaskell(PrintWriter writer, Logger logger) {
        return new JaskellExceptionLogger(writer, logger);
    }

    static Logger Neptune(PrintWriter writer, Logger logger) {
        return new NeptuneExceptionLogger(writer, logger);
    }

}
