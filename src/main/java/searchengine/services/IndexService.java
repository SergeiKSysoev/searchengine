package searchengine.services;

import searchengine.dto.indexing.IndexingRequest;
import searchengine.dto.indexing.IndexingResponse;

public interface IndexService {
    IndexingResponse startIndexing();
    IndexingResponse stopIndexing();
    IndexingResponse indexPage(IndexingRequest indexingRequest);
}
