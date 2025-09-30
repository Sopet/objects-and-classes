public class Main {
    public static void main(String[] args) {
        // Создаю объект Author
        Author author1 = new Author("Владимир", "Набоков");
        Author author2 = new Author("Лев", "Толстой");

        // Создаю объект Book и передаем объект Author
        Book book1 = new Book("Лолита", author1, 1955);
        Book book2 = new Book("Война и мир", author2, 1869);

        // Меняю год публикации одной из книг
        book1.setPublicationYear(1956);

        // Вывожу информацию о книгах
        System.out.println("Книга: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год публикации: " + book1.getPublicationYear());
        System.out.println("Книга: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год публикации: " + book2.getPublicationYear());
    }
}