class Book {
    private List<Boolean> isAvailable; // List of availability status
    public List<String> title;
    public List<String> author;

    // Constructor
    public Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book by its name
    public void borrowBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    isAvailable.set(i, false);
                    return;
                } else {
                    System.out.println("Book is not available.");
                    return;
                }
            }
        }
        System.out.println("Book is not available.");
    }

    // Method to return a book by its name
    public void returnBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (!isAvailable.get(i)) {
                    isAvailable.set(i, true);
                    return;
                }
            }
        }
    }

    // Method to get the availability of a book by its name
    public void getAvailability(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}