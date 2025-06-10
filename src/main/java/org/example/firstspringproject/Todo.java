package org.example.firstspringproject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Getter
@Setter
public class Todo {
    @Id
           @GeneratedValue(strategy = GenerationType.SEQUENCE)
            @Column(nullable =false)
    Integer id;

    @Column
    String Title;


    @Column
    Boolean completed;


}
