package solution;

import java.util.List;

class SolutionAlgorithmImpl implements SolutionAlgorithm {
    private final int alphabetSize;

    SolutionAlgorithmImpl(int alphabetSize) {
        this.alphabetSize = alphabetSize;
    }

    @Override
    public Integer execute(List<Integer> integers) {
        int[] freq = new int[1 + alphabetSize];
        int count = 0;
        int left = 0;
        Integer minLength = null;

        for (int right = 0; right < integers.size(); ++right) {
            int num = integers.get(right);
            if (num >= 1 && num <= alphabetSize) {
                if (++freq[num] == 1) {
                    ++count;
                }
            }

            while (count == alphabetSize && left <= right) {
                int currentLength = right - left + 1;
                if (minLength == null || currentLength < minLength) {
                    minLength = currentLength;
                }

                int numLeft = integers.get(left);
                if (numLeft >= 1 && numLeft <= alphabetSize) {
                    if (--freq[numLeft] == 0) {
                        --count;
                    }
                }
                ++left;
            }
        }


        return minLength;
    }
}
