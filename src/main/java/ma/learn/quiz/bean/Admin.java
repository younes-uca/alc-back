package ma.learn.quiz.bean;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.data.annotation.Persistent;

import javax.persistence.*;

@Entity
public class Admin extends User{
    private String numero;
    private String login;
    public String addresse;
    public Long getId() {
        return id;
    }


	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public void setId(Long id) {
        this.id = id;
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
