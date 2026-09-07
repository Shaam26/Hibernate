package Entity2;

import javax.persistence.*;
import java.util.List;

@Entity
public class School1 {
    @Id
    private int  id;
    private String name;
    private String location;

    @OneToOne(cascade = CascadeType.ALL)
    private Principal1 principal;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Teacher1> teachers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Principal1 getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal1 principal) {
        this.principal = principal;
    }

    public List<Teacher1> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher1> teachers) {
        this.teachers = teachers;
    }
}
