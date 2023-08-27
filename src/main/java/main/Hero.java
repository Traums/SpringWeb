package main;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "heroes")
public class Hero {
    @Id
    private long id;
    private String name;
    private int level;
    private String ultimate;
}
