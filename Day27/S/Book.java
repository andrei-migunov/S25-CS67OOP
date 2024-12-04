package S;

public class Book {
    private String name;
    private String author;
    private String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public String getText() { return text; }
    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setText(String text) { this.text = text; }

    public String replaceWordInText(String word, String replacementWord){
        return text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    public int countWordsInText(){
        return text.split(" ").length;
    }

    public void readBookAloud() {
        //imagine there is code here that will read the book to you
    }
}
