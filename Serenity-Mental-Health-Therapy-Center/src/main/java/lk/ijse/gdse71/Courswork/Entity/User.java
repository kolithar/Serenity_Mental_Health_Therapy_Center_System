package lk.ijse.gdse71.Courswork.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "USERS")
public class User {
    @Id
    @Column(name="USER-ID")
    private int user_id;
    private String user_name;
    private String password;
    private String role;
}
