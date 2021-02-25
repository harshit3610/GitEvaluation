package OpenCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DineshJangam {
    public static void main(String[] args) throws IOException, CsvException {

        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));

        //parser!
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();


        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> car = obj.readAll();



        for (String[] arr : car) {
            if (arr[0].equals("Acura")) {
                System.out.println(arr[0]);

            }
        }

    }
}









