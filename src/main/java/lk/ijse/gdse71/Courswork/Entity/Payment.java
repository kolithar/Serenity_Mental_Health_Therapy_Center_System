package lk.ijse.gdse71.Courswork.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @Column(name = "Invoic-ID")
    private String invoicID;
    private String payment_Date;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
