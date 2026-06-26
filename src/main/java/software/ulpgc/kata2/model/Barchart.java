package software.ulpgc.kata2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Barchart {
    private final String title;
    private final String xAxisTitle;
    private final String yAxisTitle;
    private final Map<String, Number> count = new HashMap<>();

    public Barchart(String title, String xAxisTitle, String yAxisTitle) {
        this.title = title;
        this.xAxisTitle = xAxisTitle;
        this.yAxisTitle = yAxisTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getxAxisTitle() {
        return xAxisTitle;
    }

    public String getyAxisTitle() {
        return yAxisTitle;
    }

    public Map<String, Number> getCount() {
        return count;
    }

    public Number get(String key) {
        return count.get(key);
    }

    public void put(String key, Number value) {
        count.put(key, value);
    }

    public Set<String> keySet() {
        return count.keySet();
    }
}
