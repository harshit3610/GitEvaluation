package CSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class car {
    public static void main(String[] args) throws IOException, CsvException {


        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();


        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> data = obj.readAll();
         car.Vrushabh_jain(data);


    }
    // Write a method for calculating and printing data of vehicles with engine size between 3 and 4
    private static void Vrushabh_jain(List<String[]> data)
    {
        System.out.println("Vrushabh_Jain");

        List<String> l1 = new LinkedList<>();
        data.stream()
                .filter(x->x[6].equals("3")||x[6].equals("4"))
                .forEach(x->l1.add(x[1]));

        l1.stream().forEach(x-> System.out.println(x));//printing vehicals data.

        long n=data.stream().filter(x->x[6].equals("3")||x[6].equals("4")).count();
        System.out.println("Total Vehicals with engine size:"+n);
    }
}