package ma.learn.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.learn.quiz.bean.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
    Admin findByNumero(String ref);
    Admin findByLogin(String login);
    Admin findAdminById(Long id);
    int deleteByNumero(String ref);
}