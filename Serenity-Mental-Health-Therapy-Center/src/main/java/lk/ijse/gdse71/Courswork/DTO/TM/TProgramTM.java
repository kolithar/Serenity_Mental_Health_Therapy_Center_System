package lk.ijse.gdse71.Courswork.DTO.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TProgramTM {
    private String therapyID;
    private String therapyName;
    private String therapyDescription;
    private Double therapyFee;
}
