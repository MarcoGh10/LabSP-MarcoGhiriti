package command;


import models.Book;
import persistence.BooksRepository;

public class CreateBookCommand {

    private final BooksRepository booksRepository;

    public CreateBookCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book execute() {
        Book book = new Book("Noapte buna, copii!");
        // Set properties on book

        // Save the book using the repository
        return booksRepository.save(book);
    }
}
