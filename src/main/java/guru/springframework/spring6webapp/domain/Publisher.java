package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString(exclude = "books")
public class Publisher {

    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Builder.Default
    @OneToMany(mappedBy = "publisher")
    Set<Book> books = new HashSet<>();

}
