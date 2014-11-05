package enseirb.t3.cnrs;

import java.util.Date;

public class Atelier {
	
	private String title;
	private String theme;
	private String type;
	private String labotatoire;
	private String lieu;
	private Date date;
	private int duree;
	private int capacité;
	
	
	
	
	public Atelier() {
		super();
		this.title = null;
		this.theme = null;
		this.type = null;
		this.labotatoire = null;
		this.lieu = null;
		this.date = null;
		this.duree = 0;
		this.capacité = 0;
	}
	
	public Atelier(String title, String theme, String type, String labotatoire,
			String lieu, Date date, int duree, int capacité) {
		super();
		this.title = title;
		this.theme = theme;
		this.type = type;
		this.labotatoire = labotatoire;
		this.lieu = lieu;
		this.date = date;
		this.duree = duree;
		this.capacité = capacité;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabotatoire() {
		return labotatoire;
	}
	public void setLabotatoire(String labotatoire) {
		this.labotatoire = labotatoire;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public int getCapacité() {
		return capacité;
	}
	public void setCapacité(int capacité) {
		this.capacité = capacité;
	}
	
	
}
