// Задача 1:
// // Реализуйте алгоритм сортировки пузырьком числового массива, результат
// после каждой итерации запишите в лог-файл.
// import java.io.IOException;
// import java.util.Arrays;
// import java.util.Random;
// import java.util.logging.FileHandler;
// import java.util.logging.Level;
// import java.util.logging.Logger;

// public class Main {
// public static void main(String[] args) throws IOException {
// Logger logger = Logger.getLogger(Main.class.getName());
// FileHandler fileHandler = new FileHandler("test.log", true);
// logger.addHandler(fileHandler);
// int[] data = new int[20];
// for (int i = 0; i < data.length; i++) {
// Random rand = new Random();
// data[i] = rand.nextInt(100);
// }
// System.out.printf("Вывод неотсортированного массива: %s\n",
// Arrays.toString(data));
// int i = 0;
// boolean flag = true;
// while (i < data.length - 1) {
// flag = false;
// for (int j = 1; j < data.length - i; j++) {
// if (data[j - 1] > data[j]) {
// int temp = data[j - 1];
// data[j - 1] = data[j];
// data[j] = temp;
// logger.log(Level.INFO, "logging: {0}", temp);
// flag = true;
// }
// }
// if (!flag) {
// break;
// }
// i++;
// }

// System.out.printf("Вывод готового массива: %s\n", Arrays.toString(data));
// }
// }

// Задача 2:
// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя
// StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.HashMap;
// import java.util.Map;

// public class Main {
// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();
// try (BufferedReader br = new BufferedReader(new FileReader("rating.json"))) {

// String data;
// while ((data = br.readLine()) != null) {
// sb.append(data);
// System.out.println(data);
// }
// } catch (IOException e) {
// e.printStackTrace();
// }
// Map<String, String> map = new HashMap<>();
// String[] keys = sb.toString().replace("{", "").replace("[", "").replace("]",
// "").replace("\"", "")
// .replaceAll("\\s", "").split("},");

// for (String data : keys) {
// String[] person = data.split(",");
// for (String keyValues : person) {
// String[] keyValue = keyValues.replace("}", "").split(":");
// String key = keyValue[0];
// String value = keyValue[1];
// map.put(key, value);
// }
// System.out.printf("Студент %s получил %s по предмету %s.\n",
// map.get("surname"),
// map.get("estimation"), map.get("object"));
// }
// }
// }

// Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
// import java.util.Scanner;

// public class Main {

// public static boolean isPalindrome(String text) {
// String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
// String reversed = new StringBuffer(replaced).reverse().toString();
// return reversed.equals(replaced);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in, "cp866");
// System.out.print("Введите фразу: ");
// String text_input = sc.nextLine();
// sc.close();

// System.out.println(isPalindrome(text_input));
// }
// }
