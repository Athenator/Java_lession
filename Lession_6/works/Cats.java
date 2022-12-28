import java.time.LocalDate;
import java.util.List;

public class Cats {
    String name;
    String ownerFullName;
    LocalDate birthday;
    float weight;
    String breed;
    List<Vactination> vactinations;
    boolean isMale;
    
    @Override
    public boolean equals (Object other) {
        if (other == null) // никогда не равен наллу
            return false;
        if (!(other instanceof Cats)) // равен только котам
            return false;
        Cats cats = (Cats) other; // посмотрим что за кот 
        return this.name.equals(cats.name);
    }
    @Override 
    public String toString() { // всегда добавляем 
        return "Cat [name =" + name + "]";
    }
   
}




