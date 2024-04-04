package searchengine.dto.indexing;

import jakarta.validation.constraints.NotNull;

public record IndexingRequest (@NotNull String url) {
}
