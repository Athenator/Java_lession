package task_2.model;

public class Product {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private Integer sort;

    public Product(String name,String country,Double price, Integer sort, Double weight) {
        this.country = country;
        this.name = name;
        this.price = price;
        this.sort = sort;
        this.weight = weight;
    }

    public Product() {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight(){
        return weight;
    }

    public void setWeight(Double weigth){
        this.weight = weigth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
