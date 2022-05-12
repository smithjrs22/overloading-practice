public class Book {
    private String title;
    private int numPages;
    private int publicationYear;

    public Book (String title, int numPages, int publicationYear){
        this.title = title;
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }
    public Book (String title){
        this.title = title;
    }
    public Book (int numPages){
        this.numPages = numPages;
    }
    public Book (int publicationYear){
        this.publicationYear = publicationYear;
    }
    public Book (int numPages, int publicationYear){
        this.numPages = numPages;
        this.publicationYear = publicationYear;
    }
    public Book (String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    

    public void getEverything(){
        System.out.println(title); 
        System.out.println(numPages); 
        System.out.println(publicationYear);  

    }
    
    public String getName(){
        return title;
    }
    



}