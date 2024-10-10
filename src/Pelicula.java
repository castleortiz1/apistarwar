import java.util.List;

public record Pelicula(String title,
                       int episode_id,
                       String opening_crawl,
                       String director,
                       String producer,
                       List<String> actors,
                       String release_date,
                       int runtime) {
}
