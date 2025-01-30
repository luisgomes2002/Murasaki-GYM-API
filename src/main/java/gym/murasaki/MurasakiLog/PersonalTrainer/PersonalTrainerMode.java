package gym.murasaki.MurasakiLog.PersonalTrainer;

import gym.murasaki.MurasakiLog.Student.StudentModel;
import gym.murasaki.MurasakiLog.Users.UsersModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_personal_trainers")
@AllArgsConstructor
@Data
public class PersonalTrainerMode extends UsersModel {

    @ManyToMany(mappedBy = "personalTrainerMode") // Um personal pode ter varios estudantes.
    private List<StudentModel> students;
}
