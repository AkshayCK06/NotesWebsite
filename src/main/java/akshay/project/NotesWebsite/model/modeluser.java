package akshay.project.NotesWebsite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name ="user")
public class modeluser {

    @Id
    @Column(name = "id")
    private int Id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

}
