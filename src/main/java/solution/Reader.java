package solution;

import java.io.IOException;
import java.util.List;

interface Reader {
    List<Integer> read() throws IOException, NumberFormatException;
}
