package quotes;

import java.util.ArrayList;

public class data {
    private String qotd_date;
    private dataquote quote;

    public data(String qotd_date, dataquote quote) {
        this.qotd_date = qotd_date;
        this.quote = quote;
    }

    public String getQotd_date() {
        return qotd_date;
    }

    public dataquote getQuote() {
        return quote;
    }

    @Override
    public String toString() {
        return "data{" +
                "qotd_date='" + qotd_date + '\'' +
                ", quote=" + quote +
                '}';
    }
}
