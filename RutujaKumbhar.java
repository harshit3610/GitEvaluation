package OpenCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class RutujaKumbhar
{
    public static void calulateNoOfColumnsInDataset() throws IOException
    {
        var itr=getIterator();
        String header[]=itr.next();
        System.out.println("Number of columns in this dataset are: "+header.length);
    }

    private static Iterator<String[]> getIterator() throws IOException
    {
        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',').build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        return obj.iterator();
    }

    public static void main(String[] args) throws IOException
    {
        calulateNoOfColumnsInDataset();
    }
}
