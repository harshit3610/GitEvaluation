package OPENCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;import java.io.Reader;import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingCSV {
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader= Files.newBufferedReader(Paths.get("Student.txt"));

        //parser!
        CSVParser Parser=new CSVParserBuilder()
                .withSeparator('\t')
                .build();


        CSVReader Objects=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        //read the contents of the file!
        List<String[]> data=Objects.readAll(); //returns a list of Strings from the file
        //3 ways for using data

        for(int i=0;i<4;i++) {
           System.out.println(data.get(i)[0]);// 0th line object
        }


        for(String  arr[]: data){
            System.out.println(arr[0]);
        }

        data.stream()
                .forEach(x-> System.out.println(x[0]));
    }
}

