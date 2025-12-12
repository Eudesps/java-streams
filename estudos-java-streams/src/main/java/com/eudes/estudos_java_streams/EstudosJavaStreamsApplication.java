package com.eudes.estudos_java_streams;

import com.eudes.estudos_java_streams.models.DadosTemporada;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class EstudosJavaStreamsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstudosJavaStreamsApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        File json = new File("estudos-java-streams/src/main/resources/jsonTemporada.json");

        DadosTemporada jsonTemporada = mapper.readValue(json, DadosTemporada.class);

        System.out.println(jsonTemporada);



    }
}
