package Combinator;

import base.Logger;

public class FileLogger implements Logger {
    public void print(int level, String msg) {
        //todo write msg to log file
    }

    /**
     * 向文件中打印信息
     *
     * @param level
     * @param msg
     */
    public void println(int level, String msg) {
        //todo write msg to log file
    }

    /**
     * 向文件中打印信息
     *
     * @param e 错误信息对象
     */
    public void printException(Throwable e) {
        //todo write exceptioon to log file.
    }
}
