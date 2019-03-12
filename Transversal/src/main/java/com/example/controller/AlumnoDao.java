package com.example.controller;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.example.model.HibernateUtil;
import com.example.model.Alumno;

public class AlumnoDao {
	public void saveAlumno(Alumno alumno) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(alumno);
            transaction.commit();
            System.out.println("Alumno insertado");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteAlumno(int id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Alumno alumno = session.get(Alumno.class, id);
            if (alumno != null) {
                session.delete(alumno);
                System.out.println("Alumno is deleted");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateAlumno(Alumno profesor) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(profesor);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    /**
     * Get all Instructors
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Alumno> getAllAlumnos() {
        Transaction transaction = null;
        List<Alumno> listOfAlumno = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            listOfAlumno = session.createQuery("from Alumno").getResultList();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfAlumno;
    }
}
