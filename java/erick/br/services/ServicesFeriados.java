package erick.br.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import erick.br.model.dto.FeriadoNacionalDTO;

@Service
public class ServicesFeriados {

	public List<FeriadoNacionalDTO> buscarFeriadoAnual(String ano) throws ParseException, StreamReadException, DatabindException, MalformedURLException, IOException {
		String apiUrl = String.format("https://brasilapi.com.br/api/feriados/v1/"+ano);
        ObjectMapper objectMapper = new ObjectMapper();

        FeriadoNacionalDTO[] externalApiDTOArray = objectMapper.readValue(new URL(apiUrl)  ,FeriadoNacionalDTO[].class);
        List<FeriadoNacionalDTO> listaFeriodos = Arrays.asList(externalApiDTOArray);
		
		
		return listaFeriodos;
	}
}
