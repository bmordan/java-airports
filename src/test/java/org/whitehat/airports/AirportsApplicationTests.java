package org.whitehat.airports;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
// import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class AirportsApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void contextLoads() {
	}

	@Test
	void airportsLoaded() throws Exception {
		this.mockMvc
			.perform(get("/airports/"))
			// .andDo(print())
			.andExpect(status().isOk());
	}

}
