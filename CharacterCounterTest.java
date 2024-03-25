

public class CharacterCounterTest {
    
    @Test
    public void nodeCoverageTestPath1() {
        char[] arr = {'a', 'b', 'c', 'd'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void edgeCoverageTestPath1() {
        char[] arr = {};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    
    private void assertEquals(int i, int output) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void edgeCoverageTestPath2() {
        char[] arr = {'a'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void edgeCoverageTestPath3() {
        char[] arr = {'a', 'b', 'b'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }

    @Test
    public void edgePairCoverageTestPath1() {
        char[] arr = {'a'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void edgePairCoverageTestPath2() {
        char[] arr = {'c', 'd'};
        char c = 'c';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void edgePairCoverageTestPath3() {
        char[] arr = {'d', 'c'};
        char c = 'c';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void edgePairCoverageTestPath4() {
        char[] arr = {};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(0, output);
    }

    @Test
    public void primePathsTestPath1() {
        char[] arr = {};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    
    @Test
    public void primePathsTestPath2() {
        char[] arr = {'a', 'b', 'a'};
        char c = 'b';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
    
    @Test
    public void primePathsTestPath3() {
        char[] arr = {'a', 'a'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(2, output);
    }
    
    @Test
    public void primePathsTestPath4() {
        char[] arr = {'b', 'b'};
        char c = 'a';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(0, output);
    }
    
    @Test
    public void primePathsTestPath5() {
        char[] arr = {'c'};
        char c = 'c';
        int output = CharacterCounter.countOccurrences(arr, c);
        assertEquals(1, output);
    }
}
