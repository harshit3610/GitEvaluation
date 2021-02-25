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
      //  var d=data.stream()


        double Sales_in_thousand=data.stream()
                .filter(x->(x[2].equals("Sales_inThousand")&&x[5].equals("Price_in_thousands")))

                .mapToDouble(x->Double.parseDouble(x[2]))
                .sum();

        System.out.println("Total"+Sales_in_thousand);






    }
}
