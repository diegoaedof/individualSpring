package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "directores")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 30)
    private String nombres;

    @ManyToMany
    @JoinTable(name = "Director_Curso",
    joinColumns = @JoinColumn(name = "FK_Director",nullable = false),
    inverseJoinColumns = @JoinColumn(name = "FK_Curso",nullable = false))
    private List<Curso> listaCursos;
}
