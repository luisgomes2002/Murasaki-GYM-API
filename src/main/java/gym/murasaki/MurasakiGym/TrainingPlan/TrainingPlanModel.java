package gym.murasaki.MurasakiGym.TrainingPlan;

import gym.murasaki.MurasakiGym.Exercises.ExerciseModel;
import gym.murasaki.MurasakiGym.PersonalTrainer.PersonalTrainerModel;
import gym.murasaki.MurasakiGym.Student.StudentModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_training_plans")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrainingPlanModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "personal_trainer_id")  // Foreing Key
        private PersonalTrainerModel personalTrainer;

        @ManyToMany
        @JoinTable(
                name = "tb_training_plan_students",
                joinColumns = @JoinColumn(name = "training_plan_id"),
                inverseJoinColumns = @JoinColumn(name = "student_id")
        ) // Foreing Key
        private List<StudentModel> students;

        private Date today;
        private String goals;
        private int timesCompleted;
        private int maxTimeCompleted;

        @OneToMany(mappedBy = "trainingPlans")
        private List<ExerciseModel> Exercises;

        private String note;
}
