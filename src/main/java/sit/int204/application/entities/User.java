package sit.int204.application.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Table;
@Entity
@Getter
@Setter
@Table(name= "users")
public class User {
    @Id
    private int id;

    private String name;
    private String email;
}
