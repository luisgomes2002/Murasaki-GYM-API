package gym.murasaki.MurasakiGym.Exercises;

import gym.murasaki.MurasakiGym.TrainingPlan.TrainingPlanModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_exercises")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExerciseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int sets;
    private int reps;
    private String weight;
    private String rest;
    private String note;

    @ManyToMany
    @JoinTable(
            name = "tb_exercise_training_plans",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "training_plan_id")
    )
    private List<TrainingPlanModel> trainingPlans;
}
