import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover runner=new DuplicateRemover();
        runner.remove("problem1.txt");
        runner.Write("unique_words.txt");
    }

}