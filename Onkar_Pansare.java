//Manufacturer,Model,Sales_in_thousands,__year_resale_value,Vehicle_type,
// Price_in_thousands,Engine_size,Horsepower,Wheelbase,Width,Length,Curb_weight,
// Fuel_capacity,Fuel_efficiency,Latest_Launch,Power_perf_factor



        package Opencsv;

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
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Onkar_Pansare {
    void HighestSales(List<String[]>data){
        OptionalDouble highest_sale=data.stream()
                .mapToDouble(x->Double.parseDouble(x[2])).max();
        System.out.println(highest_sale);
        data.stream().filter(x->x[2].equals("540.561"))
                .forEach(x-> System.out.println(Arrays.toString(x)));
    }
    public static void main(String[] args) throws IOException, CsvException {
        Reader reader= Files.newBufferedReader(Paths.get("Car_sales.csv"));

        CSVParser parser=new CSVParserBuilder()
                .withSeparator(',')
                .build();
        CSVReader obj=new CSVReaderBuilder(reader)
                .withCSVParser(parser)
                .build();

        //read contents of file
        List<String[]> data=obj.readAll();
        data.remove(0);
       Onkar_Pansare op=new Onkar_Pansare();
       op.HighestSales(data);

    }

}

/*
output:OptionalDouble[540.561]
[Ford, F-Series, 540.561, 15.075, Car, 26.935, 4.6, 220, 138.5, 79.1, 224.5, 4.241, 25.1, 18, 8/16/2012, 89.40193473]

 */
