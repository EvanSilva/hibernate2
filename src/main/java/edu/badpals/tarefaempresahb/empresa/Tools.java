package edu.badpals.tarefaempresahb.empresa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tools {


    public static void putDepartamento(Departamento departamento) {

        Departamento departamento1 = new Departamento(departamento.getNomedepartamento());

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(departamento1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

    public static void putEmpleado(Empregado empregado) {

        Empregado empleado1 = new Empregado(empregado.getNome(), empregado.getApelido1(), empregado.getApelido2(), empregado.getNss(), empregado.getSalario(), empregado.getDatanacemento(), empregado.getSexo());

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(empleado1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

    }

        public static void getEmpleado(String nss) {

            try {

                EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
                EntityManager entityManager = entityManagerFactory.createEntityManager();

                Empregado empregado = entityManager.find();

                empregado.toString();

            } catch (Exception e) {
                System.out.println("No se ha encontrado el empleado");
            }

        }

    }
