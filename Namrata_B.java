

import Jackson1.Customer;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Namrata_B {


    
    private  static double Highest_sales(List<String[]> data) {
        data.stream()
                .mapToDouble(x-> x.length)
                .max()
                .ifPresent(System.out::println);
        
    }
                
        public static void main(String[] args) throws IOException, CsvException {
        Reader file = Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReader reader = new CSVReaderBuilder(file).withCSVParser(parser).build();
        
        
        List<String[]> data = reader.readAll();

        Highest_sales(data);

    }
}

