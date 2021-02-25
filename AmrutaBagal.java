import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class AmrutaBagal {
  void Vehicledata() throws IOException, CsvException
  {
    Reader reader= Files.newBufferedReader(Paths.get("Car_sales.csv"));
    CSVParser parser=new CSVParserBuilder()
            .withSeparator(',')
            .build();

    CSVReader obj=new CSVReaderBuilder(reader)
            .withCSVParser(parser)
            .build();

    List<String[]> data=obj.readAll();
    data.stream()
      .filter(x->[12].contains(17.2))
      .forEach(System.out::println);
  }
    public static void main(String arr[])
    {
        AmrutaBagal ab=new AmrutaBagal();
        ab.Vehicledata();
    
        
    }
}
