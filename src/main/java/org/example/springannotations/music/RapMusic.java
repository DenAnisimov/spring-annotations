package org.example.springannotations.music;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("rapMusic")
public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Eminem - Lose yourself",
                "Eminem - Houdini",
                "Eminem - Without me");
    }
}
