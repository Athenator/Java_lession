import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private String owner;
    private List<Award> awards;
    
    public Cat(String name,String breed, String owner){
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.awards = new ArrayList<>();
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void addAward(Award award){
        awards.add(award);
    }

    @Override
    public String toString(){
        return "Cat{ name = " + name + "}, Award = " + awards + ", owner = {" + owner + "}";       
    }


}
