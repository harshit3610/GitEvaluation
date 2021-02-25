import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.ss.formula.functions.Count;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CarModels {

    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        //parser
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        //read the contents of file!!

        List<String[]> data = obj.readAll();

        data.stream()
                .filter(x->x[0].equals("Chevrolet"))
                .forEach(x-> System.out.println(x[1]));
       double ans= data.stream()
                .filter(x->x[0].equals("Chevrolet"))
                .count();
        System.out.println("Count is "+ans);








    }
}
