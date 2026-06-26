package software.ulpgc.kata2.model.io;

import software.ulpgc.kata2.model.Champion;

public interface ChampionDeserializer {
    Champion deserialize(String line);
}
