package ma.learn.quiz.vo;

import java.util.Date;

import javax.persistence.OneToOne;

import ma.learn.quiz.bean.Prof;

public class CalendrierVo {

	public void setDaysOfWeek(int[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	private Long id;
	private String title;
	private String titleProf;
	private String ref;
	private String color;
	private String startTime;
	private String endTime;
	private Date startRecur;
	private Date endRecur;
	private int daysOfWeek[];
	
	
	

	public String getTitleProf() {
		return titleProf;
	}

	public void setTitleProf(String titleProf) {
		this.titleProf = titleProf;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getStartRecur() {
		return startRecur;
	}

	public void setStartRecur(Date startRecur) {
		this.startRecur = startRecur;
	}

	public Date getEndRecur() {
		return endRecur;
	}

	public void setEndRecur(Date endRecur) {
		this.endRecur = endRecur;
	}

	public int[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
