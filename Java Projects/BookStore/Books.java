package BookStore;
import java.util.Objects;

public class Books {
    private String title;
    private String author;
    private double rating;
    private double cost;
    

    public Books(String title, String author, double cost, double rating){
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.cost = cost;
        
    }

    public Books(Books copy){
        this.title = copy.title;
        this.author = copy.author;
        this.rating = copy.rating;
        this.cost = copy.cost;
       
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String toString(){
        return "Title: "+this.title+
                "\nAuthor: "+this.author+
                "\nRating: "+this.rating+
                "\nPrice: "+this.cost;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Books)) {
            return false;
        }
        Books books = (Books) o;
        return Objects.equals(title, books.title) && Objects.equals(author, books.author) && rating == books.rating && cost == books.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, rating, cost);
    }
    

}
