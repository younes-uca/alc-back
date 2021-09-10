package ma.learn.quiz.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import ma.learn.quiz.bean.Prof;



@Entity
public class SchdeduleVo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	private String title;
	private Date start;
	private Date end;
	@OneToOne
	private Prof prof;
	private String color;

	public Prof getProf() {
		return prof;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
