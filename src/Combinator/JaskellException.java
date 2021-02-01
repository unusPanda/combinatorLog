package Combinator;

import java.io.Writer;

public class JaskellException extends Throwable {
    public void printExecutionTrace(Writer writer) {
        System.out.println(writer);
    }
}
