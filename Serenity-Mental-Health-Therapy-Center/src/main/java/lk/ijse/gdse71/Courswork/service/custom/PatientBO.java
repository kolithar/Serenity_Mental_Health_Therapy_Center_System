package lk.ijse.gdse71.Courswork.service.custom;

import lk.ijse.project.mentalHealthTherapyCenter.dto.MedicalHistoryDTO;
import lk.ijse.project.mentalHealthTherapyCenter.dto.PatientDTO;
import lk.ijse.project.mentalHealthTherapyCenter.dto.PatientsInEveryProgramDTO;
import lk.ijse.project.mentalHealthTherapyCenter.service.SuperBO;

import java.sql.SQLException;
import java.util.List;

public interface PatientBO extends SuperBO {
    boolean updatePatient(PatientDTO patientDTO) throws SQLException, ClassNotFoundException;
    boolean savePatient(PatientDTO patientDTO) throws SQLException, ClassNotFoundException;
    List<PatientDTO> getALL() throws Exception;
    boolean deletePatient(String patientID) throws SQLException, ClassNotFoundException;
    String getNextPatientID();
    List<MedicalHistoryDTO> getPatientHistory() throws SQLException, ClassNotFoundException;
    List<PatientsInEveryProgramDTO> getPatientsInEveryProgram();
}
