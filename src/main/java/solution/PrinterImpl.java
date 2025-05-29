package solution;

import java.io.PrintStream;

class PrinterImpl implements Printer {
    private final PrintStream printStream;

    PrinterImpl(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public <T> void print(T t) {
        printStream.println(t);
    }
}
