package org.whitehat.airports;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
    private List<Airport> airports;

    static {
        try {
            JSONParser parser = new JSONParser();
            JSONArray data = (JSONArray) parser.parse(new FileReader("airports.json"));
            // How to get this data into memory and into the List<Airport> airports class property?
        } catch(IOException | ParseException e) {
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
