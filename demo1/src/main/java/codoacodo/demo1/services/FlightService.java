package codoacodo.demo1.services;

import codoacodo.demo1.model.Flight;
import codoacodo.demo1.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class FlightService {
   @Autowired
   private FlightRepository repository;

    public List<Flight> getAllFlight(){

        return repository.findAll();
    }

    public void createFlight(Flight flight){
          repository.save(flight);
    }


    public Optional<Flight> findFlightId(Long id) {
      return repository.findById(id);
    }

    public void deleteFlightId(Long id) {
         repository.deleteById(id);
    }

    public Optional<Flight> actualizarVuelo(Flight flight) {
        repository.save(flight);
        return repository.findById(flight.getId());
    }


    //public List<Flight> listarVuelo(){return  repository.findAll();}

}
