package ru.gb.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "product")
@NamedQueries({
        @NamedQuery(name = "Product.findById",
                query = "select p from Product p where p.id = :id"),
        @NamedQuery(name = "Product.findNameById",
                query = "select p.title from Product p where p.id = :id")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private BigDecimal cost;
    @Column(name = "manufacture_date")
    private LocalDate date;
}
