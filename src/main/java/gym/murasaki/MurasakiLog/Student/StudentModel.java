package gym.murasaki.MurasakiLog.Student;

import gym.murasaki.MurasakiLog.PersonalTrainer.PersonalTrainerMode;
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
    @JoinColumn(name = "personal_trainer_id")
    private PersonalTrainerMode personalTrainerMode;

    @ManyToMany(mappedBy = "studentModel") // Um estudante pode ter varias fichas de treino.
    private List<TrainingPlanModel> trainingPlans;


}
