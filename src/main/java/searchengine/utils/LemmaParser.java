package searchengine.utils;

import org.apache.lucene.morphology.LuceneMorphology;
import org.apache.lucene.morphology.russian.RussianLuceneMorphology;
import org.springframework.stereotype.Component;
import searchengine.services.lemma.WordLemmas;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class LemmaParser {
    private static final String REGEX_FOR_NORMALIZE = "[^А-Яа-я]";
    private static final Set<String> PARTICLES_NAMES = Set.of("МЕЖД", "ПРЕДЛ", "СОЮЗ", "МС");
    private final LuceneMorphology luceneMorph;

    public LemmaParser() throws IOException {
        this.luceneMorph = new RussianLuceneMorphology();
    }

    public Map<String, Long> parseToLemmaWithCount(String text) {
        return parseToLemmaWithLemmas(text).stream
    }

    public List<WordLemmas>
}
