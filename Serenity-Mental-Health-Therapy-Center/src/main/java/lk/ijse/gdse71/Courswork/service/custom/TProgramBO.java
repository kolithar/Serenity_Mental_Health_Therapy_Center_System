package lk.ijse.gdse71.Courswork.service.custom;

import lk.ijse.project.mentalHealthTherapyCenter.dto.ProgramDto;
import lk.ijse.project.mentalHealthTherapyCenter.dto.TherapyProgramDTO;
import lk.ijse.project.mentalHealthTherapyCenter.service.SuperBO;

import java.util.List;

public interface TProgramBO extends SuperBO {
    boolean saveTPrograms(TherapyProgramDTO therapyProgramDTO);
    boolean updateTPrograms(TherapyProgramDTO therapyProgramDTO);
    boolean deleteTProgram(String therapyProgramID);
    List<ProgramDto> getALLTPrograms() throws Exception;
    String getNextProgramID();
    List<ProgramDto> getALL () throws Exception;
}
