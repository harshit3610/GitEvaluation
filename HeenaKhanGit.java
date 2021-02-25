/*
Write a method for calculating and printing data of vehicles
with engine size between 3 and 4
 */
package OPENCV;

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
import java.util.LinkedList;
import java.util.List;

public class HeenaKhanGit {
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get("Car_sales.csv"));
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .build();

        CSVReader obj = new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        List<String[]> data = obj.readAll();

        List<String[]> vehicle = new LinkedList<>();
        data.stream()
                .forEach(x -> {
                    if ((x[6].contains("3"))&&(x[6].contains("4"))) {
                        vehicle.add(x);
                    }
                });
        vehicle.forEach(x -> {
            Arrays.stream(x).forEach(y -> System.out.println(y+"####"));
        });



    }




}
