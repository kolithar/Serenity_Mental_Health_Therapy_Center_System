package lk.ijse.gdse71.Courswork.DTO.TM;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentTM {
    private  String paymentID;
    private  String patientName;
    private  Double paymentAmount;
    private  String paymentMethod;
    private  String paymentDate;
    private  String paymentTime;
}
