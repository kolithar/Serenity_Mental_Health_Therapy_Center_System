package lk.ijse.gdse71.Courswork.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "therapist")
public class Therapist implements SuperEntity {

        @Id
        private String doctorID;
        private String doctorName;
        private String doctorQualifications;
        private String doctorAvailability;
        private String doctorPhone;
        private String doctorEmail;

        @OneToMany(mappedBy = "therapist",cascade = CascadeType.ALL)
        private List<Appointments> appointments;
}
