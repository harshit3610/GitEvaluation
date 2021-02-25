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

public class ReadingCSV {
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader= Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser=new CSVParserBuilder()
                .withSeparator('\,')
                .build();
        CSVReader obj=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();
                String [] nextLine;
                int lineNum=0;
                while((nextLine = reader.readNext()) !=null)
                {
                    lineNum++;
                }
                    System.out.println("Models" + lineNum);
              
 
    }
    

}
