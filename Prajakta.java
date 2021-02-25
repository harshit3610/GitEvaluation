package OPENCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Prajakta {

    public static void main(String[] args) throws IOException, CsvException {

        Reader reader= Files.newBufferedReader(Paths.get("Car_sales.csv"));

        //Parser!
        CSVParser parser=new CSVParserBuilder()
                .withSeparator(',')
                .build();
        CSVReader obj=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> data=obj.readAll();
        List<String[]> sales=new ArrayList<>();
        var d=data.stream()
                .filter(x->!x[2].equalsIgnoreCase("Sales_in_thousand"))
                .mapToDouble(x->Double.parseDouble(x[2])).max().getAsDouble();


       // int x=0;
        data.stream()
                .filter(x->!x[2].equalsIgnoreCase("Sales_in_thousand"))
                .filter(x->Double.parseDouble(x[2]) >=d)
                .forEach(x->sales.add(x));
        System.out.println("Highest "+sales);







    }
}
