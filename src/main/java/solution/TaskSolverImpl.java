package solution;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

public class TaskSolverImpl implements TaskSolver {
    private final Reader reader;
    private final Printer outputPrinter;
    private final Printer errorPrinter;
    private final SolutionAlgorithm solutionAlgorithm;

    public TaskSolverImpl(InputStream inputStream, PrintStream outputStream, PrintStream errorStream) {
        this.reader = new ReaderImpl(inputStream);
        this.outputPrinter = new PrinterImpl(outputStream);
        this.errorPrinter = new PrinterImpl(errorStream);
        this.solutionAlgorithm = new SolutionAlgorithmImpl(26);
    }

    @Override
    public void solve() {
        List<Integer> integers;
        try {
             integers = reader.read();
        } catch (IOException | NumberFormatException e) {
            errorPrinter.print(e.getMessage());
            return;
        }
        Integer result = solutionAlgorithm.execute(integers);
        outputPrinter.print(result == null ? "NONE" : result);
    }
}
