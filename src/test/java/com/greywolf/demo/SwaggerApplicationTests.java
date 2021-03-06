package com.greywolf.demo;

import com.greywolf.demo.config.SwaggerConfig;
import org.apache.http.client.HttpClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureRestDocs(outputDir = "build/asciidoc/snippets")
@SpringBootTest(classes = {SwaggerApplication.class, SwaggerConfig.class})
@AutoConfigureMockMvc
public class SwaggerApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Test
	public void createSpringfoxSwaggerJson() throws Exception {
		//String designFirstSwaggerLocation = Swagger2MarkupTest.class.getResource("/swagger.yaml").getPath();
		String outputDir = System.getProperty("io.springfox.staticdocs.outputDir");

		//这里生成当前项目的swagger.json
		MvcResult mvcResult = this.mockMvc.perform(get("/v2/api-docs")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		String swaggerJson = response.getContentAsString();
		Files.createDirectories(Paths.get(outputDir));
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputDir, "swagger.json"), StandardCharsets.UTF_8)){
			writer.write(swaggerJson);
		}
	}

	public String sendGet(String url){
		return null;
	}
}
