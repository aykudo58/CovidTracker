package app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class DailyData
{
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDeath() {
		return death;
	}
	public void setDeath(int death) {
		this.death = death;
	}
	public int getNewCase() {
		return newCase;
	}
	public void setNewCase(int newCase) {
		this.newCase = newCase;
	}
	public int getRecover() {
		return recover;
	}
	public void setRecover(int recover) {
		this.recover = recover;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int death,newCase,recover;
    @ManyToOne
    private Country country;
}