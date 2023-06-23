package BookStore;

import java.util.Scanner;

public class Main {

    static Store store = new Store();
    static Scanner sc = new Scanner(System.in);

    public static Books[] listOfBooks(){
        Books[] books = new Books[]{
            new Books("To Kill a Mockingbird", "Harper Lee", 10.99, 4.5),
            new Books("1984", "George Orwell", 9.99, 4.3),
            new Books("Pride and Prejudice", " Jane Austen ", 8.99, 4.7),
            new Books("The Great Gatsby","F. Scott Fitzgerald",7.99,4.2),
            new Books("To the Lighthouse", "Virginia Woolf",12.99,4.4),
            new Books("The Catcher in the Rye","J.D. Salinger",10.99, 4.1),
            new Books("Moby-Dick"  ,"Herman Melville", 11.99 , 4.6),
            new Books("The Lord of the Rings", "J.R.R. Tolkien",19.99 ,4.8),
            new Books("Jane Eyre" ,"Charlotte Brontë " ,9.99 ,4.5),
            new Books("One Hundred Years of Solitude", "Gabriel García Márquez" ,13.99, 4.7),
            new Books("The Hobbit" ,"J.R.R. Tolkien" , 8.99 , 4.4),
            new Books("Brave New World", "Aldous Huxley", 9.99 ,4.3),
            new Books("The Odyssey", "Homer", 7.99, 4.6),
            new Books("Crime and Punishment", "Fyodor Dostoevsky", 11.99, 4.5),
            new Books("The Adventures of Huckleberry Finn", "Mark Twain", 9.99, 4.4),
            new Books("Wuthering Heights", "Emily Brontë", 8.99, 4.2),
            new Books("The Kite Runner", "Khaled Hosseini", 10.99, 4.6),
            new Books("The Alchemist", "Paulo Coelho", 9.99, 4.3),
            new Books( "Anna Karenina", "Leo Tolstoy", 12.99, 4.7),
            new Books("The Picture of Dorian Gray", "Oscar Wilde", 7.99, 4.1),
            new Books("The Book Thief", "Markus Zusak", 10.99, 4.5),
            new Books("The Chronicles of Narnia", "C.S. Lewis",19.99, 4.7),
            new Books("The Sun Also Rises" ,"Ernest Hemingway", 9.99, 4.3),
            new Books("Gone with the Wind", "Margaret Mitchell", 12.99, 4.6),
            new Books("The Secret Life of Bees","Sue Monk Kidd", 8.99, 4.2),
            new Books("The Girl with the Dragon Tattoo", "Stieg Larsson",10.99,4.4),
            new Books("The Picture of Dorian Gray" , "Oscar Wilde",7.99, 4.1),
            new Books("The Fault in Our Stars", "John Green",9.99,4.5),
            new Books("The Grapes of Wrath","John Steinbeck",11.99, 4.6),
            new Books("Sapiens: A Brief History of Humankind","Yuval Noah Harari",14.99, 4.8),
            new Books("The Da Vinci Code" ,"Dan Brown",8.99,4.3),
            new Books("Frankenstein","Mary Shelley",7.99, 4.4),
            new Books("The Handmaid's Tale","Margaret Atwood" ,9.99, 4.5),
            new Books("The Help","Kathryn Stockett",10.99, 4.7),
            new Books("The Brothers Karamazov","Fyodor Dostoevsky",11.99, 4.6),
            new Books("A Game of Thrones","George R.R. Martin",9.99, 4.4),
            new Books("The Name of the Wind","Patrick Rothfuss",12.99, 4.5),
            new Books("Beloved" , "Toni Morrison",8.99,4.3),
            new Books("The Road", "Cormac McCarthy",10.99, 4.5),
            new Books("The Count of Monte Cristo", "Alexandre Dumas", 11.99, 4.6),
            new Books("The Picture of Dorian Gray", "Oscar Wilde",7.99, 4.1),
            new Books("The Joy Luck Club","Amy Tan",9.99, 4.4),
            new Books("The Bell Jar","Sylvia Plath",8.99, 4.3),
            new Books("The Martian", "Andy Weir",10.99, 4.5),
            new Books("The Color Purple","Alice Walker",9.99,4.6),
            new Books("A Thousand Splendid Suns","Khaled Hosseini",11.99,4.7),
            new Books("The Hobbit" ,"J.R.R. Tolkien",8.99, 4.4),
            new Books("The Goldfinch","Donna Tartt",12.99, 4.2),
            new Books("The Catcher in the Rye","J.D. Salinger",10.99,4.1),
            new Books("The Hunger Games","Suzanne Collins",9.99,4.3),
            new Books("Norwegian Wood","Haruki Murakami",11.99,4.5),
            new Books("The Pillars of the Earth","Ken Follett",10.99, 4.6),
            new Books("The Book of Lost Things", "John Connolly",8.99, 4.2),
            new Books("Educated","Tara Westover",9.99, 4.7),
            new Books("The Shining","Stephen King",11.99, 4.4),
            new Books("The Shadow of the Wind" ,"Carlos Ruiz Zafón",10.99, 4.5),
            new Books("The Girl on the Train", "Paula Hawkins",9.99,4.3),
            new Books("The Secret History", "Donna Tartt",12.99,4.6),
            new Books("The Handmaid's Tale","Margaret Atwood",10.99, 4.4),
            new Books("American Gods" ,"Neil Gaiman",11.99,4.7),
            new Books("The Road Less Traveled","M. Scott Peck",9.99,4.3),
            new Books("The Secret","Rhonda Byrne",8.99, 4.1),
            new Books("A Man Called Ove","Fredrik Backman",10.99, 4.5),
            new Books("The Handmaid's Tale" ,"Margaret Atwood",9.99,4.4),
            new Books("The Power of Now","Eckhart Tolle",12.99, 4.7),
            new Books("The Nightingale","Kristin Hannah",9.99, 4.6),
            new Books("The Immortal Life of Henrietta Lacks","Rebecca Skloot",11.99,4.3),
            new Books("Eleanor Oliphant Is Completely Fine","Gail Honeyman",10.99, 4.5),
            new Books("The Giver","Lois Lowry",8.99,4.2),
            new Books("The Silent Patient","Alex Michaelides",9.99, 4.4),
            new Books("The Subtle Art of Not Giving a F*ck","Mark Manson",10.99, 4.3),
            new Books("The Tattooist of Auschwitz","Heather Morris",11.99, 4.5),
            new Books("A Brief History of Time","Stephen Hawking" ,10.99,4.6),
            new Books("The Fault in Our Stars","John Green",9.99, 4.4),
            new Books("Educated" , "Tara Westover",12.99,4.7),
            new Books("The Help","Kathryn Stockett",10.99, 4.6),
            new Books("The Martian","Andy Weir",9.99, 4.4),
            new Books("The Girl with the Dragon Tattoo","Stieg Larsson" ,10.99, 4.3),
            new Books("The Catcher in the Rye", "J.D. Salinger",8.99,4.1),
            new Books("The Book Thief" ,"Markus Zusak",9.99, 4.5),
            new Books("The Great Gatsby","F. Scott Fitzgerald",7.99,4.2),
            new Books("To Kill a Mockingbird","Harper Lee",9.99, 4.6),
            new Books("1984","George Orwell",8.99, 4.5),
            new Books("Pride and Prejudice","Jane Austen",7.99,4.7),
            new Books("The Lord of the Rings","J.R.R. Tolkien",19.99, 4.8),
            new Books("Brave New World","Aldous Huxley",9.99, 4.3),
            new Books("The Chronicles of Narnia","C.S. Lewis",19.99, 4.7),
            new Books("The Hobbit","J.R.R. Tolkien",8.99, 4.4),
            new Books("The Catcher in the Rye","J.D. Salinger",10.99, 4.1),
            new Books("The Odyssey", "Homer",11.99, 4.6),
            new Books("The Divine Comedy","Dante Alighieri",12.99, 4.5),
            new Books("Crime and Punishment","Fyodor Dostoevsky",9.99, 4.4),
            new Books("One Hundred Years of Solitude","Gabriel Garcia Marquez",10.99,4.7),
            new Books("The Picture of Dorian Gray","Oscar Wilde",7.99,4.1),
            new Books("Moby-Dick","Herman Melville",11.99, 4.6),
            new Books("The Alchemist","Paulo Coelho",9.99, 4.3),
            new Books("The Canterbury Tales","Geoffrey Chaucer",8.99, 4.2),
            new Books("The Brothers Karamazov" ,"Fyodor Dostoevsky",10.99 ,4.5),
            new Books("The Sun Also Rises","Ernest Hemingway",9.99, 4.4),
            new Books("Wuthering Heights","Emily Bronte",7.99, 4.3)
        };

        return books;
    }

    public static void printStore(){
        System.out.println(store);
    }

    public static void purchaseBook(){
        System.out.println("How may I help you. \nHere is the list of Books available in our Store.");
        printStore();

        System.out.println("Which one would you like to buy?");

        sc.nextLine();

        String bookTitle = sc.nextLine();

        System.out.println("Here is your book sir.It will be $"+store.getBook(bookTitle).getCost());
        
        System.out.println("Would like to purchase another one? (yes- to buy,  no- to checkout) in lowercase");
        String buyAgain = sc.nextLine(); 
        while(buyAgain.equals("yes")){
            purchaseBook();
        }
        store.sellBook(bookTitle);
        System.out.println("Here is your change..  \nThank you visit Again!");
    }

    public static void updateStore(){
        System.out.println("Enter password:");
        sc.nextLine();
        String pass = sc.nextLine();

        while(!pass.equals("Madhan")){
            System.out.println("No access will be provided to you. You are not the Store Manager...");
            break;
        }

        while(pass.equals("Madhan")){
            System.out.println("What do you want to do? Update existing book details or add new book? \n1-to update, 2- to add book to store");
            int whataction = sc.nextInt();
            switch(whataction){
                case 1:
                        printStore();
                        System.out.println("Which book you want update?");
                        sc.nextLine();
                        String name = sc.nextLine();
                        Books book = store.getBook(name);
                        System.out.println("Which detail you want to update in book? \n1-Title, 2-Author, 3-cost, 4-Rating");
                        int choice = sc.nextInt();
                        sc.nextLine();
                        switch(choice){
                            case 1: System.out.println("Enter title: ");
                            String bookName = sc.nextLine();
                            book.setTitle(bookName);break;

                            case 2: System.out.println("Enter Author: ");
                            sc.nextLine();
                            String bookAuthor = sc.nextLine();
                            book.setAuthor(bookAuthor);break;

                            case 3: System.out.println("Enter Cost: ");
                            double bookCost = sc.nextDouble();
                            book.setCost(bookCost);break;

                            case 4: System.out.println("Enter rating: ");
                            double bookRating = sc.nextDouble();
                            book.setRating(bookRating);break;

                            default:System.out.println("Not a valid input!!");
                        }

                        System.out.println("Here is the updated details of Book\n");
                        System.out.println(store.getBook(name)+"\n");

                        System.out.println("If you want to update again enter yes. else no: ");
                        String updateagain = sc.nextLine();

                        while(updateagain.equals("yes")){
                            updateStore();
                        }
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Enter book details:");
                        System.out.println("Name: ");
                        String nameofbook = sc.nextLine();
                        System.out.println("Author: ");
                        String authorofbook = sc.nextLine();
                        System.out.println("Cost: ");
                        double costofbook = sc.nextDouble();
                        System.out.println("Rating: ");
                        double ratingofbook = sc.nextDouble();

                        Books newBook = new Books(nameofbook, authorofbook, costofbook, ratingofbook);
                        store.addBooks(newBook);break;

                default: System.out.println("Not a valid action. Try again!");
            }
        }

        
    }

    public static void main(String[] args) {
        
        for(Books book:listOfBooks()){
            store.addBooks(book);
        }

        System.out.println("Who are you? 1-Store Manager 2-Customer");

        int levelOfAccess = sc.nextInt();

        switch(levelOfAccess){
            case 1: updateStore();break;

            case 2: purchaseBook(); break;

            default: System.out.println("Invalid input try again!");
        }
        
    }
}
