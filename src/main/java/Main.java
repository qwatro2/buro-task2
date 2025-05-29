import solution.TaskSolver;
import solution.TaskSolverImpl;

public class Main {
    public static void main(String[] args) {
        TaskSolver solver = new TaskSolverImpl(System.in, System.out, System.err);
        solver.solve();
    }
}
