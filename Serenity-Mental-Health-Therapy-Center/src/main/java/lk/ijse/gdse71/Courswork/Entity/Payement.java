package lk.ijse.gdse71.Courswork.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class Payement {


    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Data
    @Table(name = "PATIENT")
    public class Patient {
        @Id
        @Column(name = "PATIENT-ID")
        private String Patient_ID;
        private String Name;
        private String NIC_number;
        private String Gender;
        private String BirthDate;
        private String Address;
        private String PhoneNumber;
        private String medical_history;

        @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Therapysession> therapySessions; //hellooooo

// this clone

    }

}
