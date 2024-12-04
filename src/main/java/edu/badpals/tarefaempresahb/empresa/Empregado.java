package edu.badpals.tarefaempresahb.empresa;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "empregados")
public class Empregado {
    @Size(max = 25)
    @Column(name = "nome", length = 25)
    private String nome;

    @Size(max = 25)
    @Column(name = "apelido1", length = 25)
    private String apelido1;

    @Size(max = 25)
    @Column(name = "apelido2", length = 25)
    private String apelido2;

    @Id
    @Size(max = 15)
    @Column(name = "nss", length = 15)
    private String nss;

    @Column(name = "salario")
    private Float salario;

    @Column(name = "datanacemento")
    private LocalDate datanacemento;

    @Column(name = "sexo")
    private Character sexo;

    public Empregado() {
    }

    public Empregado(String nome, String apelido1, String apelido2, String nss, Float salario, LocalDate datanacemento, Character sexo) {
        this.nome = nome;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.nss = nss;
        this.salario = salario;
        this.datanacemento = datanacemento;
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getApelido2() {
        return apelido2;
    }

    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public LocalDate getDatanacemento() {
        return datanacemento;
    }

    public void setDatanacemento(LocalDate datanacemento) {
        this.datanacemento = datanacemento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", apelido1='" + apelido1 + '\'' +
                ", apelido2='" + apelido2 + '\'' +
                ", nss='" + nss + '\'' +
                ", salario=" + salario +
                ", datanacemento=" + datanacemento +
                ", sexo=" + sexo +
                '}';
    }
}