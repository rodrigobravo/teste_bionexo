package com.bionexo.teste;

import com.bionexo.teste.domain.UbsCsv;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {


    public List<UbsCsv> parse() {
        Reader reader = null;

        try {
            reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("ubs.csv").getFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }


        CsvToBean<UbsCsv> csvToBean = new CsvToBeanBuilder(reader)
                .withType(UbsCsv.class)
                .build();

        return csvToBean.parse();

    }
}

    


