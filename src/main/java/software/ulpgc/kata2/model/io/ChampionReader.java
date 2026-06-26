package software.ulpgc.kata2.model.io;

import software.ulpgc.kata2.model.Champion;

import java.io.IOException;
import java.util.List;

public interface ChampionReader {
    List<Champion> read() throws IOException;
}
