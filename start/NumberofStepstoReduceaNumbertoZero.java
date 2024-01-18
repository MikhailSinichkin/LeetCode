
// Код
// Результат Теста
// Testcase
// Testcase
// 1342. Количество шагов для уменьшения числа до нуля
// Легко
// Темы
// Компании
// Подсказка
// Учитывая целое число num, верните количество шагов для уменьшения его до нуля.
// За один шаг, если текущее число четное, вы должны разделить его на 2, в противном случае вам придется отнять от него 1 .
public class NumberofStepstoReduceaNumbertoZero {
    int count = 0;
    
    public int numberOfSteps(int num) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            count++;
            return numberOfSteps(num / 2);
        }
        else {
            count++;
            return numberOfSteps(num - 1);
        }
    }
    public static void main(String[] args) {
        NumberofStepstoReduceaNumbertoZero solution = new NumberofStepstoReduceaNumbertoZero();
        int result = solution.numberOfSteps(14); // пример вызова метода с аргументом 10
        System.out.println(result); // вывод результата работы метода на экран
    }

}
