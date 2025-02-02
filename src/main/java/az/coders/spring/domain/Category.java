package az.coders.spring.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Table(name="categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    @SequenceGenerator(name="seq",sequenceName = "seq_categories",allocationSize=1)
    @Column(name="category_id")
    private int id;
    @Column(name="category_name")
    private String name;
    private String description;

    public Category(String description, String name) {
        this.description = description;
        this.name = name;
    }
}
