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
@Table(name = "THERAPIPROGRAM")

public class TherapyProgram {
    @Id
    private String programId;
    private String name;
    private double fee;
    private String duration;


    @ManyToOne
    @JoinColumn(name = "therapist_id")
    private Therapist therapist;

    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL)
    private List<Enrolment> enrolments;
}
