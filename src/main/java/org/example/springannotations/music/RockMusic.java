package org.example.springannotations.music;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Skillet - Monster",
                "Hollywood undead - Levitate",
                "Skillet - Hero");
    }
}
