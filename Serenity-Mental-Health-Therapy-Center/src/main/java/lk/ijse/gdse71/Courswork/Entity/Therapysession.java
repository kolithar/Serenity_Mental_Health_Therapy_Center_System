package lk.ijse.gdse71.Courswork.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "THERAPYSESSION")
public class Therapysession {
    @Id
    @Column(name = "SESSION_ID")

    private String session_id;
    private String session_notes;
    private String session_date;
    private String session_time;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
