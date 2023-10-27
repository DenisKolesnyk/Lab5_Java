import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notepad {
    private Map<String, List<String>> записи;

    public Notepad() {
        записи = new HashMap<>();
    }

    public void додатиЗапис(String дата, String запис) {
        записи.computeIfAbsent(дата, k -> new ArrayList<>()).add(запис);
    }

    public List<String> отриматиЗаписи(String дата) {
        return записи.get(дата);
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad();

        notepad.додатиЗапис("2023-10-27", "Перша запис на сьогодні");
        notepad.додатиЗапис("2023-10-27", "Друга запис на сьогодні");
        notepad.додатиЗапис("2023-10-28", "Запис на завтра");

        List<String> записиНа2023_10_27 = notepad.отриматиЗаписи("2023-10-27");
        List<String> записиНа2023_10_28 = notepad.отриматиЗаписи("2023-10-28");

        System.out.println("Записи на 2023-10-27:");
        for (String запис : записиНа2023_10_27) {
            System.out.println(запис);
        }

        System.out.println("Записи на 2023-10-28:");
        for (String запис : записиНа2023_10_28) {
            System.out.println(запис);
        }
    }
}
