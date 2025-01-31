package gym.murasaki.MurasakiGym.Student;

import gym.murasaki.MurasakiGym.PersonalTrainer.PersonalTrainerModel;
import gym.murasaki.MurasakiGym.TrainingPlan.TrainingPlanModel;
import gym.murasaki.MurasakiGym.Users.UsersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_students")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class StudentModel extends UsersModel {

    @ManyToMany
    @JoinTable(
            name = "tb_student_personal_trainers",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "personal_trainer_id")
    ) // Foreing Key
    private List<PersonalTrainerModel> personalTrainers;

    @ManyToMany(mappedBy = "students")
    private List<TrainingPlanModel> trainingPlans;


}
