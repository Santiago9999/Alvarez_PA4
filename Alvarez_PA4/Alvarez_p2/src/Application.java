public class Application {
    public static void main(String[] args) {
        String fileIn ="problem2.txt";
        String fileOut="unique_word_counts.txt";
        DuplicateCounter Count= new DuplicateCounter();
        Count.count(fileIn);
        Count.write(fileOut);
    }
}
