import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SushovanManna {

    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get("complaints.csv"));

        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();


        List<String[]> data = obj.readAll();
//Write a method for calculating and printing total combined sales of each manufacturer
        System.out.println("Total Number of sales: ");
        List<String>Carsales=new ArrayList<>();

        data.stream()
                .filter(x -> x[2].equals(""))
                .mapToDouble(x -> Double.parseDouble(x[2]))
                .sum();

    }
}
