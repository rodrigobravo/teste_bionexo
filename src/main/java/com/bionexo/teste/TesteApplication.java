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



		Reader reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("ubs.csv").getFile()));

		CsvToBean<UbsCsv> csvToBean = new CsvToBeanBuilder(reader)
				.withType(UbsCsv.class)
				.build();

		List<UbsCsv> unidades = csvToBean.parse();

		for (UbsCsv unidade : unidades)
			System.out.println(unidade.getNom_estab());

	}

}
