package codoacodo.demo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Flight {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origen;
    private String destino;
    private  String fechaDeSalida;
    private  String fechaDeLlegada;
    private double precio;
    private String frecuencia;

    public Flight(String origen, String destino, String fechaSalida, String fechaLlegada, double precio, String frecuencia) {
        this.origen = origen;
        this.destino = destino;
        this.fechaDeSalida = fechaSalida;
        this.fechaDeLlegada = fechaLlegada;
        this.precio = precio;
        this.frecuencia = frecuencia;
    }

}
