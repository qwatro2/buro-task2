package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class ReaderImpl implements Reader {
    private final BufferedReader bufferedReader;

    ReaderImpl(InputStream inputStream) {
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override
    public List<Integer> read() throws IOException, NumberFormatException {
        bufferedReader.readLine();
        String input = bufferedReader.readLine();
        return Arrays.stream(input.split(" ")).map(Integer::parseInt).toList();
    }
}
