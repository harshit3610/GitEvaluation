package GitAssessment;

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

public class RahulSajekar {
    public static void main(String[] args) throws IOException, CsvException {
        Reader file = Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        CSVReader csv = new CSVReaderBuilder(file).withCSVParser(parser).build();
        List<String[]> data = csv.readAll();
        printTotalSales(data);
    }

    private static void printTotalSales(List<String[]> data) {
        System.out.println("Total Sales in Thousands : ");
        System.out.println(
                data.stream()
                        .skip(1)
                        .mapToDouble(x->Double.parseDouble(x[2]))
                        .sum());
    }
}