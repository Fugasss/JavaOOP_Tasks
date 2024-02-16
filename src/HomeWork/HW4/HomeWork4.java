package HomeWork.HW4;

import java.util.ArrayList;

import HomeWork.HomeWork;

public class HomeWork4 extends HomeWork {
    public void Execute(){
        String menu = """
                PRESS [1] TO SEARCH BOOK BY NAME
                PRESS [2] TO SEARCH BOOK BY CODE
                PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT
""";
        
        System.out.println(menu);

        Library library = new Library("Central Library", "Almaty", "Kazakhstan"); 

        library.addBook(new LiteratureBook("Say my name", "1", 123, "Haizenberg", 2020));
        library.addBook(new LiteratureBook("Don't say my name", "2", 255, "Haizenberg", 2021));
        library.addBook(new ScientificBook("Say my name as a scienceman","3", 384,1488, "Haizenberg"));
        library.addBook(new ScientificBook("Don't say my name as a scienceman","4", 888,1488, "Haizenberg"));
        library.addBook(new Book("Say my name as a libraryman","5", 111));
        library.addBook(new Book("Say my name as Arsen","5", 11));
        library.addBook(new Book("Say my name as Nikita","6", 15));
        library.addBook(new Book("Say my name as Miras","7", 88));

        int command = _scanner.nextInt();

        Book foundBook = null;

        if(command == 1){
            System.out.print("ENTER BOOK NAME: ");
            _scanner.nextLine();
            String name = _scanner.nextLine();
            
            foundBook = library.findByName(name);
        }
        else if(command == 2){
            System.out.print("ENTER BOOK CODE: ");
            _scanner.nextLine();
            String code = _scanner.nextLine();
            
            foundBook = library.findByCode(code);
        }
        else if(command == 3){
            System.out.print("ENTER BOOK MIN MAX NUMBER OF PAGES: ");

            int min = _scanner.nextInt();
            int max = _scanner.nextInt();

            foundBook = library.findByPagesCount(min, max);
        }


        System.out.println((foundBook == null ? "Not Found": foundBook));
    }
}


class Book{
    protected String name;
    protected String code;
    protected int pages;

    public Book(){}
    public Book(String name, String code, int pages){
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public String getCode(){
        return code;
    }

    public int getPages(){
        return pages;
    }

    public String getBookData(){
        return String.format("Book: %s\nCode: %s\nAmount of pages: %d\n", name, code, pages );
    }

    @Override
    public String toString(){
        return getBookData();
    }
}

class ScientificBook extends Book{
    private int price;
    private String publisher;

    public ScientificBook(){
    }

    public ScientificBook(String name, String code, int pages, int price, String publisher){
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    public int getPrice(){
        return price;
    }

    public String getPublisher(){
        return publisher;
    }

    @Override
    public String getBookData(){
        String baseFormat = super.getBookData();

        return baseFormat + String.format("Price: %d\nPublisher: %s\n", price, publisher);
    }
}

class LiteratureBook extends Book{
    private String author;
    private int publishedYear;

    public LiteratureBook(){
    }

    public LiteratureBook(String name, String code, int pages, String author, int publishedYear){
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear(){
        return publishedYear;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public String getBookData(){
        String baseFormat = super.getBookData();
    
        return baseFormat + String.format("Author: %s\nYear: %d\n", author, publishedYear);
    }
}

class Library{
    private String name;
    private String city;
    private String country;
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public Library(String name, String city, String country){
        books = new ArrayList<>();
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getName(){return name;}
    public String getCity(){return city;}
    public String getCountry(){return country;}

    public void addBook(Book book){
        books.add(book);
    }

    public void printLibraryData(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findByCode(String code){
        return books.stream().filter(x->x.getCode().equals(code)).findFirst().get();
    }

    public Book findByName(String name){
        return books.stream().filter(x->x.getName().equals(name)).findFirst().get();
    }

    public Book findByPagesCount(int minCount, int maxCount){
        return books.stream().filter(x->x.getPages() >= minCount && x.getPages() <= maxCount).findFirst().get();
    }
}
