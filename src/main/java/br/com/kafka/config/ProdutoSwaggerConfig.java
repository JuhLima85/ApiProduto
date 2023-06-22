package br.com.kafka.config;



import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ProdutoSwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.kafka"))
				.paths(PathSelectors.regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
		
	}
	
	/*
	private ApiInfo metaInfo() { 
		return new ApiInfoBuilder() 
		.title("Teste")
		 .description("\"Teste\"")
		 .version("1.0.0")
		 .license("Apache License Version 2.0") 
		 .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"") 
		 .build(); 
		}
*/
	
	
	
    private ApiInfo metaInfo() {
    	  ApiInfo apiInfo = new ApiInfo(    	
    			  "Produtos API REST",
                  "API REST de cadastro de produtos.",
                  "1.0.0",
                  "Terms of Service",
                  new Contact("Juliana Lima", "https://github.com/JuhLima85", "juju_amil@hotmail.com"),
                  "Apache License Version 2.0",
                  "https://www.apache.org/licensen.html", new ArrayList<VendorExtension>()
          );
    	  
    	  return apiInfo;
                  
      }
    	    
		
	}
	

