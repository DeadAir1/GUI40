package Practise.Compare;

import java.util.Comparator;

public class Product implements Comparable<Product> {

    private String title;
    private int price;
    private Category category;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    Product(String title, int price, Category category){
        this.title=title;
        this.price=price;
        this.category=category;
    }

    public int compareTo(Product product){
       return this.price-product.price>0?1:this.price-product.price==0?0:-1;

    }
}
 enum Category {
    FOOD(1),CAR_PARTS(2),CLOTHES(3),ARGD(4);
    private int value;

    Category(int value){
        this.value=value;
    }

     public int getValue() {
         return value;
     }
 }
enum ProductBy{
    PRICE,TITLE,CATEGORY
}
class ProductComparator implements Comparator<Product>{

    private ProductBy productBy;
    ProductComparator(ProductBy productBy){
        this.productBy=productBy;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return switch (this.productBy){
            case TITLE -> o1.getTitle().charAt(0)-o2.getTitle().charAt(0);
            case PRICE -> o1.getPrice()-o2.getPrice();
            case CATEGORY ->o1.getCategory().getValue()-o2.getCategory().getValue();
        };
    }
}


