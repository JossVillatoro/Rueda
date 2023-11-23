package com.rueda.proyecto.Entidades.boleto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Aqui le especificamos el nombre de la entidad a spring y jpa como la encontrara
//al igual que como buscara nuestra tabla
@Entity(name = "Boleto" )
@Table(name = "boleto")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Boleto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int numero;


}
