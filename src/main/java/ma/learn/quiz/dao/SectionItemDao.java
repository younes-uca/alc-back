package ma.learn.quiz.dao;

import ma.learn.quiz.bean.SectionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionItemDao extends JpaRepository<SectionItem,Long> {

    SectionItem findSectionItemById(Long id);
    List<SectionItem> findSectionItemBySectionId(Long id);
}
