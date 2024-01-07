package custom.deserializer;

import java.util.List;

public record Blog(List<Post> posts) {
}
