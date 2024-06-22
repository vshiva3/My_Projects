package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Books> books;
    
    public Store(){
        this.books = new ArrayList<>();
    }

    public void addBooks(Books book){
        this.books.add(new Books(book));
    }

    public void setBook(int index, Books book){
        this.books.set(index, new Books(book));
    }

    public Books getBook(String title){
        for(int i=0;i<this.books.size();i++){
            if(books.get(i).getTitle().contains(title)){
                return this.books.get(i);
            }
        }
        return new Books(null);
    }

    public Books isAvailable(int index){
        return new Books(books.get(index));
    }

    public void sellBook(String title){
        for(int i=0;i<this.books.size();i++){
            if(books.get(i).getTitle().contains(title)){
                this.books.remove(i);
            }
        }
    }

    public boolean contains(Books book){
        return this.books.contains(book);
    }

    public String toString(){
        String temp = "";
        for(int i=0; i<books.size();i++){
            temp += "---"+(i+1)+"---";
            temp += "\n";
            temp += books.get(i);
            temp += "\n\n";
        }

        return temp;
    }
}
