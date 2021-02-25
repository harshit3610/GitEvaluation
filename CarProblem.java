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

public class CarProblem {
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
        Double s=data.stream()
                .filter(x->!x[2].equalsIgnoreCase("Sales_in_thousands"))

                .mapToDouble(x->Double.parseDouble(x[2])).max().getAsDouble();
        System.out.println(s);
        data.forEach(x->
                Arrays.stream(x).forEach(line-> System.out.print(line+" ")));
        System.out.println();
    }
}