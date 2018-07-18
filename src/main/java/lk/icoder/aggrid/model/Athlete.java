package lk.icoder.aggrid.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project ag-grid
 * @Author DILAN on 7/15/2018
 */

@Entity
@Cacheable(false)
public class Athlete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version = 0L;

    private String name;

    @OneToOne
    private Country country;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "athlete", orphanRemoval = true)
    private List<Result> results = new ArrayList<>();

    public Athlete() {

    }

    public Athlete(String name, Country country, List<Result> results) {
        this.name = name;
        this.country = country;
        this.results = results;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id=" + id +
                ", version=" + version +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", results=" + results +
                '}';
    }
}
