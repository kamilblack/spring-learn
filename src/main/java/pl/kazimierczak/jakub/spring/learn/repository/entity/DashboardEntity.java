package pl.kazimierczak.jakub.spring.learn.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DASHBOARDS")
public class DashboardEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String size;

    public DashboardEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "DashboardEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
