package edu.badpals.tarefaempresahb;

import edu.badpals.tarefaempresahb.empresa.Departamento;
import edu.badpals.tarefaempresahb.empresa.Empregado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static edu.badpals.tarefaempresahb.empresa.Tools.getEmpleado;


public class Main {

    public static void main(String[] args) {

     getEmpleado("39489820Q");
    }
}
