package OpenCsv;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Deepali {

    public static void main(String[] args) throws IOException, CsvException {


        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();


        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();
        List<String[]> data = obj.readAll();
        data.remove(0);

        Deepali d1 = new Deepali();
        d1.Calculate(data);
    }


    void calculate(List<String[]> data)
    {
        data.stream()
                .filter(x->x[3].equals((20)).forEach(x->
                                System.out.println(Arrays.toString(x)));
        
    }

}
