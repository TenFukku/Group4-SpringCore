package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Student student){
        entityManager.persist(student);
    }

    @Override
    public Optional<Student> findById(Long id){
        Student student = entityManager.find(Student.class, id);
        return Optional.ofNullable(student);
    }

    @Override
    public List<Student> findAll(){
        TypedQuery<Student> query = entityManager.createQuery("FROM Student", Student.class);
        return query.getResultList();
    }

    @Override
    public void update(Student student){
        entityManager.merge(student);
    }

    @Override
    public void deleteById(long id){
        Student student1 = entityManager.find(Student.class, id);
        if(student1 != null){
            entityManager.remove(student1);
        }
    }

}
