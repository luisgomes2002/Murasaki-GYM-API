package gym.murasaki.MurasakiLog.Exercises;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ExerciseModel {

    private String name;
    private String setsAndReps;
    private String weight;
    private String rest;
    private String note;
}
