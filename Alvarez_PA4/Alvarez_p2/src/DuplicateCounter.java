import java.util.*;
import java.io.*;

public class DuplicateCounter {
    Map<String,Integer> Counter;
    public DuplicateCounter(){
        Counter=new HashMap<String, Integer>();

    }
    public void count(String dataFile){
        Scanner file=null;
        try {
            file = new Scanner(new File(dataFile));
        }catch (FileNotFoundException g) {
            System.out.println(g.getMessage());
            return;
        }
        while (file.hasNext()){
            String word=file.next().toLowerCase();
            Integer amount = Counter.get(word);
            if(amount==null)
                amount=1;
            else {
                amount++;
            }
            Counter.put(word,amount);
        }
            file.close();

    }
    public void write(String outputFile){
        try {
            PrintWriter out = new PrintWriter(new File(outputFile));
            for (String k : Counter.keySet()) {
                out.println(k + ": " + Counter.get(k));

            }
            out.close();
        }catch(FileNotFoundException g){
            System.out.println(g.getMessage());
        }
    }
}
