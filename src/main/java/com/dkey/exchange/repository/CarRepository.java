package com.dkey.exchange.repository;

import com.dkey.exchange.entity.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class CarRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Car> getCarByOwnerInn(String inn){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("innChar"),inn));
        return em.createQuery(criteriaQuery).getResultList();
    }
    public List<Car> getCarByNReg(String nReg){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("nRegNew"),nReg));
        return em.createQuery(criteriaQuery).getResultList();
    }
    public List<Car> getCarByVin(String vin){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("vin"),vin));
        return em.createQuery(criteriaQuery).getResultList();
    }
    public List<Car> getCarByCert(String cert){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("newCert"),cert));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
