package software.ulpgc.kata2;

import software.ulpgc.kata2.model.io.ChampionReader;
import software.ulpgc.kata2.model.io.CsvChampionDeserializer;
import software.ulpgc.kata2.model.io.FileChampionReader;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ChampionReader reader = new FileChampionReader(
                new File("League of Legends Champion Stats 12.23.csv"),
                new CsvChampionDeserializer()
        );
        try {
            reader.read().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
