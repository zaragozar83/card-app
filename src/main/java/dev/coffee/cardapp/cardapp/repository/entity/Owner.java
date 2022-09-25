package dev.coffee.cardapp.cardapp.repository.entity;

import dev.coffee.cardapp.cardapp.repository.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    @Id
    @Column(name = "ownerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;
    private String firstName;
    private String lastName;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "car_owner",
    joinColumns = {@JoinColumn(name = "ownerid")},
    inverseJoinColumns = {@JoinColumn(name = "id")})
    @ToString.Exclude
    private Set<Car> cars;
}
