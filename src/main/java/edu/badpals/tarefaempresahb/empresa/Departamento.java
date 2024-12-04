package edu.badpals.tarefaempresahb.empresa;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "departamentos")
public class Departamento {

    public Departamento() {
    }

    public Departamento(String nomedepartamento) {
        this.nomedepartamento = nomedepartamento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pj_seq")
    @SequenceGenerator(name = "pj_seq", initialValue = 0, allocationSize = 1 ) // Configuración de secuencia

    @Column(name = "numdepartamento")
    private Integer numdepartamento;

    @Size(max = 25)
    @Column(name = "nomedepartamento", length = 25)
    private String nomedepartamento;

    public Integer getNumdepartamento() {
        return numdepartamento;
    }

    public void setNumdepartamento(Integer numdepartamento) {
        this.numdepartamento = numdepartamento;
    }

    public String getNomedepartamento() {
        return nomedepartamento;
    }

    public void setNomedepartamento(String nomedepartamento) {
        this.nomedepartamento = nomedepartamento;
    }

}