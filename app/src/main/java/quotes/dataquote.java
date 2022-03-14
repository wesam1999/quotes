package quotes;

public class dataquote {
    private int id;
    private String author;
    private String body;

    public dataquote(int id, String author, String body) {
        this.id = id;
        this.author = author;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "dataquote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
