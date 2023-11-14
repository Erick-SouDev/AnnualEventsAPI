package erick.br.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigCrossOringinGlobal implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") /*FAZ O MAPEAMENTO*/
		.allowedOrigins("*") /*DEFINE AS ORIGENS DE DOMIOS SE LIVRE PARA TODOS OU EXPECIFICO*/
		.allowedMethods("GET", "POST", "DELETE", "PUT") /*AQUI DEFINE QUAIS VERBOS  */
		.allowCredentials(true) /*PERMITE USO DE CREDENCIAIS*/;	
	}
}
