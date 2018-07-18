package lk.icoder.aggrid.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * @Project ag-grid
 * @Author DILAN on 7/15/2018
 */
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version = 0L;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Athlete athlete;

    private int age;
    private int year;
    private String date;
    private int gold;
    private int silver;
    private int bronze;

    @OneToOne
    private Sport sport;

    public Result(){}

    public Result(int age, int year, String date, int gold, int silver, int bronze, Sport sport) {
        this.age = age;
        this.year = year;
        this.date = date;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.sport = sport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", version=" + version +
                ", athlete=" + athlete +
                ", age=" + age +
                ", year=" + year +
                ", date='" + date + '\'' +
                ", gold=" + gold +
                ", silver=" + silver +
                ", bronze=" + bronze +
                ", sport=" + sport +
                '}';
    }
}
