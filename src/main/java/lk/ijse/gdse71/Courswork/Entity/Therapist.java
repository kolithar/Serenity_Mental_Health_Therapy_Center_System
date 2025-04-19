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
@Table(name = "THERAPIST")

public class Therapist {

    @Id
    @Column(name = "THERAPIST-ID")
    private String therapist_id;
    private String therapistName;
    private String spazy;
    private String contach;


    @OneToMany(mappedBy = "therapist", cascade = CascadeType.ALL)
    private List<Therapysession> sessions;

    @OneToMany(mappedBy = "therapist", cascade = CascadeType.ALL)
    private List<TherapyProgram> programs;
} 
