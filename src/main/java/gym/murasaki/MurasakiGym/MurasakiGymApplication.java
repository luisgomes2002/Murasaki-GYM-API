package gym.murasaki.MurasakiGym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MurasakiGymApplication {

	public static void main(String[] args) {
		SpringApplication.run(MurasakiGymApplication.class, args);
	}

}


/*
			PersonalTrainerModel
- Varios personais tem varios alunos
- Varios personais tem varios treinos

			StudentModel
- Varios estudantes tem varios treinos
- Varios estudantes tem varios personais

			TrainingPlanModel
- Varios treinos tem um personal
- Varios treinos tem varios alunos
- Um treino tem varios exercicios

			ExerciseModel
- Varios exercicios tem varios treinos
*/
