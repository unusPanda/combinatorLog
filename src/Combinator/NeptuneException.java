package Combinator;

import java.io.Writer;

public class NeptuneException extends Throwable {
    public void printExecutionTrace(Writer writer) {
        System.out.println(writer);
    }
}
