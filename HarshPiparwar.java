import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HarshPiparwar {



        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();
        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

    public HarshPiparwar() throws IOException {
    }

    void CalculatingData(){
        List<String> l1 = new LinkedList<>();
        Iterator<String[]> itr = obj.iterator();
        while (itr.hasNext()) {
                String[] temp = itr.next();
                l1.add(temp[5]);
            System.out.println(l1);

            }

    }
    public static void main(String[] args) throws IOException {
        HarshPiparwar h1=new HarshPiparwar();
        h1.CalculatingData();
    }
}
