package searchengine.services.lemma;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import searchengine.model.Page;
import searchengine.repository.IndexRepository;
import searchengine.repository.LemmaRepository;
import searchengine.repository.SiteRepository;
import searchengine.utils.HtmlParser;
import searchengine.utils.LemmaParser;

@Service
@RequiredArgsConstructor
@Slf4j
public class LemmaService {
    private final LemmaRepository lemmaRepository;
    private final IndexRepository indexRepository;
    private final SiteRepository siteRepository;
    private final LemmaParser lemmaParser;
    private final HtmlParser htmlParser;

    public void findAndSave(Page page) {

    }
}