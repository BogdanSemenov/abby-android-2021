package tasks;

/**
 * Напишите класс, конструктор которого принимает два массива:
 * массив значений и массив весов значений.
 * Класс должен содержать метод, который будет возвращать элемент
 * из первого массива случайным образом, с учётом его веса.
 * Пример:
 * Дан массив [1, 2, 3], и массив весов [1, 2, 10].
 * В среднем, значение «1» должно возвращаться в 2 раза реже,
 * чем значение «2» и в десять раз реже, чем значение «3».
 */
class RandomFromArray {
    private int[] random_array;

    public RandomFromArray(int[] values, int[] weights) {
	int weight_sum = 0;
	for (int i = 0; i < weights.length; ++i) {
	    weight_sum += weights[i];
	}
	random_array = new int[weight_sum];
	
	for (int i = 0, j = 0; i < weights.length; ++i) {
	    for (int k = 0; k < weights[i]; ++k) {
		random_array[j] = values[i];
		j += 1;
	    }
	}
    }

    public int getRandomElement() {
	int index = (int) (Math.random() * random_array.length) - 1;
	return random_array[index];
    }
}

public class Task05 {


}
