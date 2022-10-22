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
        Main.addNumbers("str1", 2);
        Main.addNumbers("str2", 1);
        Main.addNumbers("str1", 5);
       // Main.addNumbers("str1", 5);   если раскоментировать выбрасывается исключение
        System.out.println(numbers);


        System.out.println();
        List<Integer> number1 = Arrays.asList(5, 6, 8); //19
        List<Integer> number2 = Arrays.asList(521, 658, 842); //2021
        List<Integer> number3 = Arrays.asList(1, 326, 88); //415
        List<Integer> number4 = Arrays.asList(77, 26, 118); // 221
        List<Integer> number5 = Arrays.asList(115, 3, 58); //176
        String string1 = "string1";
        String string2 = "string2";
        String string3 = "string3";
        String string4 = "string4";
        String string5 = "string5";

        Map<String, List<Integer>> random = new HashMap<>();
        random.put(string1, number1);
        random.put(string2, number2);
        random.put(string3, number3);
        random.put(string4, number4);
        random.put(string5, number5);
        //System.out.println(random);
        random.forEach((key, value) ->System.out.println(key + " " + value));
        Integer one = number1.get(0) + number1.get(1) + number1.get(2);
        Integer two = number2.get(0) + number2.get(1) + number2.get(2);
        Integer three = number3.get(0) + number3.get(1) + number3.get(2);
        Integer four = number4.get(0) + number4.get(1) + number4.get(2);
        Integer five = number5.get(0) + number5.get(1) + number5.get(2);
        System.out.println();

        Map<String, Integer> remake = new HashMap<>();
        remake.put(string1, one);
        remake.put(string2, two);
        remake.put(string3, three);
        remake.put(string4, four);
        remake.put(string5, five);
        //System.out.println(remake);
        remake.forEach((key, value) ->System.out.println(key + " " + value));
        System.out.println();

        Map<Integer, String> random2 =new TreeMap<>();
        random2.put(1,"первый");
        random2.put(2,"второй");
        random2.put(3,"третий");
        random2.put(4,"четвертый");
        random2.put(5,"пятый");
        random2.put(6,"шестой");
        random2.put(7,"седьмой");
        random2.put(8,"восьмой");
        random2.put(9,"девятый");
        random2.put(10,"десятый");
        System.out.println(random2);

    }
    public static Map<String, Integer> numbers = new HashMap<>();
    public static void addNumbers(String string, Integer integer){
       if(numbers.containsKey(string) && numbers.containsValue(integer)){
       throw new IllegalArgumentException("дважды добавить одно и то же нельзя!!");
        }else {
           numbers.put(string, integer);
       }
    }
}