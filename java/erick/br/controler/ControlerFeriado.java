package erick.br.controler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import erick.br.model.dto.FeriadoNacionalDTO;
import erick.br.services.ServicesFeriados;

@CrossOrigin
@RestController
@RequestMapping(value = { "/api/feriado/nacional" } )
public class ControlerFeriado {

	@Autowired
	private ServicesFeriados feriados;

	@GetMapping(value = "/{ano}")
	public ResponseEntity<List<FeriadoNacionalDTO>> buscarFeriadoDoAno(@PathVariable("ano") String ano) throws ParseException, StreamReadException, DatabindException, MalformedURLException, IOException {
		List<FeriadoNacionalDTO> dtos = feriados.buscarFeriadoAnual(ano);
		return new ResponseEntity<List<FeriadoNacionalDTO>>(dtos , HttpStatus.OK);

	}

}
