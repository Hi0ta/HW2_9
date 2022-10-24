import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> guide = new HashMap<>();
        guide.put("Иванов Иван", "89506666587");
        guide.put("Сидоров Самуил", "89864554545");
        guide.put("Иванова Инна", "89897437665");
        guide.put("Сидорова Ирина", "89986372287");
        guide.put("Петров Дамир", "89393636724");
        guide.put("Сергеев Сергей", "89834572426");
        guide.put("Сергеева Светлана", "89932472500");
        guide.put("Помирова Полина", "89056113383");
        guide.put("Помиров Петр", "89240014233");
        guide.put("Павлов Павел", "89842156211");
        guide.put("Помирова Лада", "89384688742");
        guide.put("Павлова Яна", "89996854544");
        guide.put("Ивлева Ираида", "80031141075");
        guide.put("Ивлев Игорь", "89937203420");
        guide.put("Пузанков Прохор", "89933554445");
        guide.put("Пузанкова Лила", "89003666852");
        guide.put("Пономаренко Зоя", "89339547775");
        guide.put("Пономаренко Захар", "89226338440");
        guide.put("Сидорчук Анна", "89998852144");
        guide.put("Сидорчук Ольга", "89556633177");
        guide.put("Ивлев Игорь", "89937203420"); //проверка на задвоение
        guide.put("Сидоров Самуил", "89864554545"); //проверка на задвоение

        int counterG = 1;
       for(Map.Entry<String, String> entry: guide.entrySet()) {
           System.out.println(counterG + " " + entry.getKey() + ": " + entry.getValue());
           counterG++;
       }
        System.out.println();
        Main.addNumbers("str1", 1);
        Main.addNumbers("str2", 1);
        Main.addNumbers("str3", 2);
        Main.addNumbers("str1", 2);
        Main.addNumbers("str1", 1);
       // Main.addNumbers("str2", 1);// если раскоментировать выбрасывается исключение
        System.out.println(numbers);
        System.out.println();

        Map<String, List<Integer>> random = new HashMap<>();
        random.put("первая", Arrays.asList(5, 6, 8)); //19
        random.put("вторая", Arrays.asList(521, 658, 842)); //2021
        random.put("третья", Arrays.asList(1, 326, 88)); //415
        random.put("четвертая", Arrays.asList(77, 26, 118)); //221
        random.put("пятая", Arrays.asList(115, 3, 58)); //176

        random.forEach((key, value) ->System.out.println(key + " " + value));
        System.out.println();

        Map<String, Integer> remake = new HashMap<>();
        random.forEach((key, value) -> remake.put(key, value.get(0) + value.get(1) + value.get(2)));

        remake.forEach((key, value) ->System.out.println(key + " " + value));
        System.out.println();

        Map<Integer, String> random2 = new LinkedHashMap<>();
        random2.put(7,"седьмой");
        random2.put(10,"десятый");
        random2.put(1,"первый");
        random2.put(4,"четвертый");
        random2.put(2,"второй");
        random2.put(3,"третий");
        random2.put(5,"пятый");
        random2.put(6,"шестой");
        random2.put(8,"восьмой");
        random2.put(9,"девятый");

        System.out.println(random2);

    }
    public static Map<String, Integer> numbers = new HashMap<>();
    public static Map<String, Integer> numbers2 = new HashMap<>();
    public static void addNumbers(String string, Integer integer){
        numbers2.put(string, integer);
       if(numbers.equals(numbers2)){
       throw new IllegalArgumentException("дважды добавить одно и то же нельзя!!");
        }else {
           numbers.put(string, integer);
       }
    }
}