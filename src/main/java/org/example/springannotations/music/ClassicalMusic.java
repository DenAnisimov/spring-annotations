package org.example.springannotations.music;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong()
    {
        return List.of("Пётр Чайковский — Танец \"Трепак\"",
                "Вольфганг Амадей Моцарт — \"Турецкий марш\"",
                "Людвиг ван Бетховен — \"К Элизе\"");
    }
}
