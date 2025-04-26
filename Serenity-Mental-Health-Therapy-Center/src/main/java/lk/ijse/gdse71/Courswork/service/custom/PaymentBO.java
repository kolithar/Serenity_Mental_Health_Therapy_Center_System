package lk.ijse.gdse71.Courswork.service.custom;

import lk.ijse.project.mentalHealthTherapyCenter.dto.PaymentDTO;
import lk.ijse.project.mentalHealthTherapyCenter.service.SuperBO;

import java.util.List;

public interface PaymentBO extends SuperBO {
    List<PaymentDTO> getALL() throws Exception;
}
