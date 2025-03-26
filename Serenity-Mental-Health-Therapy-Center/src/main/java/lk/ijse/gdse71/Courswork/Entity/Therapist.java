package lk.ijse.gdse71.Courswork.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "THERAPIST")
public class Therapist {
    @Id
    @Column(name = "THERAPIST-ID")
    private String therapist_id;
    private String therapistName;
    private String spazy;
    private String contach;

} 
