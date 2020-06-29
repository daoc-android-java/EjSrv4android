package daoc.srv;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private int id;
	private String usr;
	private String pwd;
	
	public Usuario() {}
	
	public Usuario(String usr, String pwd) {
		this.usr = usr;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usr=" + usr + ", pwd=" + pwd + "]";
	}
	
}
