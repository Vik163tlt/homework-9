public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Alexandr", "Volkov");
        Author author2 = new Author("John", "Tolkien");

        Book book1 = new Book("The Wizard of the Emerald City", author1, 1939);
        Book book2 = new Book("The Hobbit", author2, 1937);

        System.out.println(book1.getBookName());
        System.out.println(book1.getAuthor().getAuthorName());
        System.out.println(book1.getPublishingYear());

        book1.setPublishingYear(1977);
        System.out.println(book1.getPublishingYear());

        System.out.println(book2.getBookName());
        System.out.println(book2.getAuthor().getAuthorName());
        System.out.println(book2.getPublishingYear());



    }
}