package lk.ijse.gdse71.Courswork.DTO.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TherapistTM {
    private String doctorID;
    private String doctorName;
    private String doctorQualifications;
    private String doctorAvailability;
    private String doctorPhone;
    private String doctorEmail;
}
