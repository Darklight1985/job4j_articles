package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        Article rsl;
        WeakReference<List<Word>> wordsCopy = new WeakReference<>(words);
        Collections.shuffle(wordsCopy.get());
        var content = wordsCopy.get()
                .stream()
                .map(Word::getValue)
                .collect(Collectors.joining(" "));
        rsl = new Article(content);
        content = null;
        return rsl;
    }
}
