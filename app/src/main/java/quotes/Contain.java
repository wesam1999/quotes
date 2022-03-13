package quotes;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;

public class Contain {
private String text;
private String likes;
private String author;
private String[] tags;


    public Contain(String text, String likes, String author, String[] tags) {
        this.text = text;
        this.likes = likes;
        this.author = author;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Contain{" +
                "text='" + text + '\'' +
                ", likes='" + likes + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
