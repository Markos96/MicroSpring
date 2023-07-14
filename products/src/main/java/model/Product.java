package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    @Column(name = "create_at")
    private Date createAt;
}
