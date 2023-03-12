package pl.kazimierczak.jakub.spring.learn.web.model;

public class DashboardModel {

    private String name;
    private String size;

    public DashboardModel() {
    }

    public DashboardModel(String name, String size) {
        this.name = name;
        this.size = size;
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
        return "DashboardModel{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
