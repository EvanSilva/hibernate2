package edu.badpals.tarefaempresahb.empresa;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "proxectos")
public class Proxecto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pj_seq")
    @SequenceGenerator(name = "pj_seq", initialValue = 1, allocationSize = 1) // Configuración de secuencia
    @Column(name = "numproxecto")
    private Integer numproxecto;

    @Size(max = 25)
    @Column(name = "nomeproxecto", length = 25)
    private String nomeproxecto;

    @Size(max = 25)
    @Column(name = "lugar", length = 25)
    private String lugar;

    public Integer getNumproxecto() {
        return numproxecto;
    }

    public void setNumproxecto(Integer numproxecto) {
        this.numproxecto = numproxecto;
    }

    public String getNomeproxecto() {
        return nomeproxecto;
    }

    public void setNomeproxecto(String nomeproxecto) {
        this.nomeproxecto = nomeproxecto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}