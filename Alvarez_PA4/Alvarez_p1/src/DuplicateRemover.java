import java.io.*;
import java.util.*;

public class DuplicateRemover {
    Set<String> uniqueWords = new HashSet<String>();
    public  void remove(String dataFile)  throws FileNotFoundException{
        String nextWord;
        Scanner input = new Scanner(new File(dataFile));
        while (input.hasNext()){
            nextWord=input.next();
            uniqueWords.add(nextWord);

        }
        input.close();
    }
    public void Write(String outputFile) throws IOException{
        File txt;
        FileWriter txtw = null;
        txt= new File(outputFile);
        Iterator itr = uniqueWords.iterator();

        if(txt.exists()) {

            txtw = new FileWriter(txt, false);

            while (itr.hasNext()) {
                String str = (String) itr.next();
                txtw.write(str + "\n");
            }
            txtw.close();
        }
        else{
            txt.createNewFile();
            txtw=new FileWriter(txt);
            while(itr.hasNext()) {
                String str = (String) itr.next();
                txtw.write(str + "\n");
            }
            txtw.close();

            }


        }

}

