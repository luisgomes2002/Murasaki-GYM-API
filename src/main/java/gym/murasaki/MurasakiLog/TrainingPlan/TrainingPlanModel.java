package gym.murasaki.MurasakiLog.TrainingPlan;

import gym.murasaki.MurasakiLog.Exercises.ExerciseModel;
import gym.murasaki.MurasakiLog.PersonalTrainer.PersonalTrainerMode;
import gym.murasaki.MurasakiLog.Student.StudentModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_training_plans")
@AllArgsConstructor
@Data
public class TrainingPlanModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private PersonalTrainerMode personalTrainerMode;

        @ManyToMany
        @JoinColumn(name = "student_id")
        private StudentModel studentModel;

        private Date today;
        private String goals;
        private int timesCompleted;
        private int maxTimeCompleted;
        private List<ExerciseModel> Exercises;
        private String note;
}
