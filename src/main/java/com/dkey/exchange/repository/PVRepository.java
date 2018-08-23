package com.dkey.exchange.repository;

import com.dkey.exchange.entity.PV;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class PVRepository {
    @PersistenceContext
    private EntityManager em;

    public List<PV> getLicenseByDriverInn(String inn){
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<PV> criteriaQuery = criteriaBuilder.createQuery(PV.class);
        Root<PV> e = criteriaQuery.from(PV.class);
        criteriaQuery.select(e).where(criteriaBuilder.equal(e.get("inn"),inn));
        return em.createQuery(criteriaQuery).getResultList();
    }
}
