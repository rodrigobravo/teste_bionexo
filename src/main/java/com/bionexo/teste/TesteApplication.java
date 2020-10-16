package com.bionexo.teste;

import com.bionexo.teste.domain.UbsCsv;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) throws IOException  {
		SpringApplication.run(TesteApplication.class, args);

	}

}
