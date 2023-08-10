package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@ToString(exclude = {"authors"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @ManyToMany
    @Builder.Default
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"))
    private Set<Author> authors = new HashSet<>();

    @ManyToOne
    private Publisher publisher;
    private String title;

    private String isbn;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getId(), book.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
