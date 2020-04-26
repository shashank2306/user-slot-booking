package com.example.slotBooking.services;

import com.example.slotBooking.bean.UserSlotBean;
import com.example.slotBooking.entity.UserSlotEntity;
import com.example.slotBooking.repository.UserSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.awt.print.Book;
import java.time.LocalDate;
import java.util.List;

@Service
public class UserSlotServiceImpl implements UserSlotService {

    @Autowired
    UserSlotRepository repository;

    @Autowired
    EntityManager em;

    @Override
    public UserSlotEntity save(UserSlotEntity entity) {
        return repository.save(entity);
    }

    @Override
    public List<UserSlotEntity> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<UserSlotEntity> cq = cb.createQuery(UserSlotEntity.class);

        Root<UserSlotEntity> book = cq.from(UserSlotEntity.class);
        Predicate flag = cb.equal(book.get("flag"), 1);
        cq.where(flag);

        TypedQuery<UserSlotEntity> query = em.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public UserSlotBean delete(UserSlotEntity entity) {
        entity.setFlag(0);
        repository.save(entity);
        return null;
    }
}
