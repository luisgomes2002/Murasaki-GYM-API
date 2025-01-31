package gym.murasaki.MurasakiLog.Exercises;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ExerciseModel {

    private String name;
    private int sets;
    private int reps;
    private String weight;
    private String rest;
    private String note;

}
