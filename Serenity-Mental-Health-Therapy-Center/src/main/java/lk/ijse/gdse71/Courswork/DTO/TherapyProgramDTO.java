package lk.ijse.gdse71.Courswork.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TherapyProgramDTO {
    private String therapyID;
    private String therapyName;
    private String therapyDescription;
    private Double therapyFee;
}
