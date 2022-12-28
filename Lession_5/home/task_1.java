import java.util.HashMap;
import java.util.Map;



public class task_1 {
    public static void main(String[] args) {

        Map<String, String> bookFone = new HashMap<>();    
        bookFone.put("Сергеев И.И.", "6-23-23");
        bookFone.put("Аверин А.А.", "1-23-63");
        bookFone.put("Бугаев Д.Н.", "8-76-53");
        bookFone.put("Смирнов К.А.", "4 -15-78");
        bookFone.put("Заверин С.С.", "6-23-89, 13-43-53");
        bookFone.put("Книгин П.К.", "9-15-13");
        bookFone.put("Кононенко Г.О.", "5-78-99, 6-29-00");
        System.out.println(bookFone.get("Сергеев И.И."));
        System.out.println(bookFone.get("Кононенко Г.О."));

        addBookFone(bookFone, "Костров Б.Е.", "2-02-45");

        System.out.println(bookFone.get("Костров Б.Е."));

        deleteBookFone(bookFone, "Сергеев И.И.");

        System.out.println(bookFone);
    }

    
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}