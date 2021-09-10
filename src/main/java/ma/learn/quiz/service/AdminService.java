package ma.learn.quiz.service;

import ma.learn.quiz.bean.Admin;
import ma.learn.quiz.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;

@Service
public class AdminService {
    public Admin findByNumero(String ref) {
        return adminDao.findByNumero(ref);
    }

    public Admin findByLogin(String login) {
		return adminDao.findByLogin(login);
	}

	public int deleteByNumero(String ref) {
        return adminDao.deleteByNumero(ref);
    }

    public List<Admin> findAll() {
        return adminDao.findAll();
    }
    
    public Admin findAdminById(Long id) {
		return adminDao.findAdminById(id);
	}

	public int save(Admin admin ) {
		if(findAdminById(admin.getId())!=null) {
			return -1;
		}
		if(findByLogin(admin.getLogin())!=null) {
			return -2;
		}
		else {
			adminDao.save(admin);
			return 1;
		}
			
	}

    public Object findByCritere(String login, String password)
	{
		String query = "SELECT a FROM Admin a WHERE a.login= '"+login+"' and a.password='"+password+"'";
		return entityManager.createQuery(query).getSingleResult();
	}
    
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private EntityManager entityManager;
}
