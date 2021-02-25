package OpenCSV;

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

public class Jidnyasa {
    public static void main(String[] args) throws IOException, CsvException {


    Reader reader = Files.newBufferedReader(Paths.get("Car.csv"));


        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();
        List<String[]> data= obj.readAll();

//Write a method for calculating and printing data
// of vehicles with Resale value over 20




        data.stream()
                .filter(x->x.equals(x[3]>"20"))
                .forEach(x-> System.out.println(x ));

    }
}
