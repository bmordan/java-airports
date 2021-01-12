package org.whitehat.airports;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airports")
public class AirportsController {
    private static List<Airport> airports;

    static {
        // next line is using the Try-With-Resource syntax to ensure that the
        // input stream gets closed (very important else get memory leaks!)
        try (InputStream is = AirportsController.class.getResourceAsStream("/static/airports.json");){
            ObjectMapper mapper = new ObjectMapper();

            airports = mapper.readValue(is, new TypeReference<List<Airport>>() {
            });
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
    
    @GetMapping("/")
    public List<Airport> getAirports() {
        return this.airports;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String createAirport(@RequestBody Airport airport) {
        return "created";
    }
}
