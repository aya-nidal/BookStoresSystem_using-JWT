package fin.fintechpath.com.BookStoresSystem.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name")
    private String bookName;
    @ManyToMany(mappedBy = "books")
    private List<Store> stores = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    @JsonIgnore
    public List<Store> getStores() {
        return stores;
    }
}
