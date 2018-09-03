package com.dkey.exchange.repository;

import com.dkey.exchange.entity.Car;
import com.dkey.exchange.utils.Transliterator;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Comparator;
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
    public Car getCarByNReg(String nReg){
//        String reg = Transliterator.toTranslit(nReg);
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("nRegNew"),nReg));
        return  em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
    public Car getCarByVin(String vin){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("vin"),vin));

        return em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
    public Car getCarByEngine(String nEngine){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("nEngine"),nEngine));

        return em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
    public Car getCarByChassis(String chassis){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("nShassis"),chassis));

        return em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
    public Car getCarByBody(String body){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("nBody"),body));

        return em.createQuery(criteriaQuery).getResultList().stream().filter(car->car.getdReg()!=null).max(Comparator.comparing(Car::getdReg))
                .orElse(null);
    }
    public List<Car> getCarByCert(String cert){
        Transliterator.toTranslit(cert);
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);
        Root<Car> e = criteriaQuery.from(Car.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("newCert"),cert));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
