package com.project.baseballCommunity.repository;

import com.project.baseballCommunity.domain.Comment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class CommentRepository {

    @PersistenceContext
    public final EntityManager em;

    public void save(Comment comment) {
        em.persist(comment);
    }

    public List<Comment> findAll(){
        return em.createQuery("select c from Comment c", Comment.class).getResultList();
    }

    public Comment findById(Long id) {
        return em.find(Comment.class, id);
    }
}
