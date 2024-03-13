package codoacodo.demo1.controller;


import codoacodo.demo1.model.Flight;
import codoacodo.demo1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("")
    public List<Flight> getAllFlight(){
        return  flightService.getAllFlight();
    }

    @PostMapping("/add")
    public void createFlight(@RequestBody Flight flight){
         flightService.createFlight(flight);
    }

    @GetMapping("{id}")
    public Optional<Flight> findFlightById(@PathVariable Long id){
        return  flightService.findFlightId(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){

        flightService.deleteFlightId(id);
    }

    @PutMapping("/update")
    public Optional<Flight> updateFlight(@RequestBody Flight flight){
        return flightService.actualizarVuelo(flight);
    }



}
