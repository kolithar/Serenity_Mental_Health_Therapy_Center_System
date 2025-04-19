package lk.ijse.gdse71.Courswork;

import lk.ijse.gdse71.Courswork.Entity.Patient;
import lk.ijse.gdse71.Courswork.Entity.User;
import lk.ijse.gdse71.Courswork.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();

        user.setUser_id(1);
        user.setUser_name("kamal");
        user.setPassword("123");
        user.setRole("manaege");
        session.save(user);

        Patient patient = new Patient();

       patient.setPatient_ID("P1");
       patient.setAddress("gall");
       patient.setBirthDate("2006/7/9");
       patient.setGender("male");
       patient.setPhoneNumber("94588457");
       patient.setMedical_history("tuuij");
       session.save(patient);
       transaction.commit();

    }


}
