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
import java.util.OptionalDouble;

/*
Write a method for calculating and printing data of vehicles with highest total sales
 */
public class Yogita_Hajare {
    public void  highest_Sales(List<String[]> data)
    {
        OptionalDouble sale =data.stream()
                .filter(x->!x[2].equalsIgnoreCase("Sales_in_thousands"))
                .mapToDouble(x->Double.parseDouble(x[2])).max();
        System.out.println(sale);
        data.stream().filter(x->x[2].equals("540.561"))
                .forEach(x-> System.out.println(Arrays.toString(x)));
    }
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();

        CSVReader obj = new CSVReaderBuilder(reader).withCSVParser(parser).build();


        List<String[]> Sales = obj.readAll();
       Yogita_Hajare yh =new Yogita_Hajare();
       yh.highest_Sales(Sales);
    }
}
/*
-----------OUTPUT--------------------

OptionalDouble[540.561]
[Ford, F-Series, 540.561, 15.075, Car, 26.935, 4.6, 220, 138.5, 79.1, 224.5, 4.241, 25.1, 18, 8/16/2012, 89.40193473]
 */
