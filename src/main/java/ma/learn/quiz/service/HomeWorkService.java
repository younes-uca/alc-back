package ma.learn.quiz.service;


import ma.learn.quiz.bean.HomeWork;
import ma.learn.quiz.dao.HomeWorkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
public class HomeWorkService {

    public Optional<HomeWork> findById(Long id) {
        return homeWorkDao.findById(id);
    }

    @Transactional
    public void deleteById(Long id) {
        homeWorkDao.deleteById(id);
    }

    public HomeWork findBySectionId(Long id) {
        return homeWorkDao.findBySectionId(id);
    }

    public List<HomeWork> findAll() {
        return homeWorkDao.findAll();
    }

    public int save(HomeWork homeWork) {
        homeWorkDao.save(homeWork);
        return 1;
    }

    @Autowired
    private HomeWorkDao homeWorkDao;

}
