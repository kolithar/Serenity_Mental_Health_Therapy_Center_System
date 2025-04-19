package lk.ijse.project.mentalHealthTherapyCenter.entity;

import jakarta.persistence.*;
import lk.ijse.gdse71.Courswork.Entity.Patient;
import lk.ijse.gdse71.Courswork.Entity.Therapist;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "appointments")

public class Appointments implements SuperEntity{
    @Id
    private String sessionId;
    private String time;
    private String notes;
    private String date;

    @ManyToOne
    @JoinColumn(name = "patient_Id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Therapist therapist;

    @OneToOne
    @JoinColumn(name = "payment_ID")
    private lk.ijse.project.mentalHealthTherapyCenter.entity.Payment payment;

    private String status;
    @PrePersist
    public void prePersist() {
        if (status == null) {
            status = "NO";
        }
    }

}



