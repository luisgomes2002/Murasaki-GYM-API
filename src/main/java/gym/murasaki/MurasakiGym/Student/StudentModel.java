package gym.murasaki.MurasakiLog.Student;

import gym.murasaki.MurasakiLog.PersonalTrainer.PersonalTrainerModel;
import gym.murasaki.MurasakiLog.TrainingPlan.TrainingPlanModel;
import gym.murasaki.MurasakiLog.Users.UsersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_students")
@AllArgsConstructor
@Data
public class StudentModel extends UsersModel {

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "personal_trainer_id"))
    private List<PersonalTrainerModel> personalTrainers;

    @ManyToMany(mappedBy = "students") // Um estudante pode ter varias fichas de treino.
    private List<TrainingPlanModel> trainingPlans;


}
