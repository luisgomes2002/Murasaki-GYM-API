package gym.murasaki.MurasakiGym.PersonalTrainer;

import gym.murasaki.MurasakiGym.Student.StudentModel;
import gym.murasaki.MurasakiGym.TrainingPlan.TrainingPlanModel;
import gym.murasaki.MurasakiGym.Users.UsersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_personal_trainers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class PersonalTrainerModel extends UsersModel {

    @ManyToMany(mappedBy = "personalTrainers")
    private List<StudentModel> students;

    @OneToMany(mappedBy = "personalTrainer")
    private List<TrainingPlanModel> trainingPlans;
}
