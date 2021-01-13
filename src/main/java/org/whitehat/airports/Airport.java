package org.whitehat.airports;

public class Airport {

    public Airport() {
    }

    public Airport(String icao, String iata, String name, String city, String state, String country, int elevation, Double lat, Double lon, String tz) {
        this.icao = icao;
        this.iata = iata;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.elevation = elevation;
        this.lat = lat;
        this.lon = lon;
        this.tz = tz;
    }

    public String getIcao() {
        return this.icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getIata() {
        return this.iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getElevation() {
        return this.elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public Double getLat() {
        return this.lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return this.lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getTz() {
        return this.tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }
    private String icao = "";
    private String iata = "";
    private String name = "";
    private String city = "";
    private String state = "";
    private String country = "";
    private int elevation = 0;
    private Double lat = 0.0;
    private Double lon = -0.0;
    private String tz = "";
}
