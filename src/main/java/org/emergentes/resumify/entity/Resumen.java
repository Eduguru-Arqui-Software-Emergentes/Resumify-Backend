package org.emergentes.resumify.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Entity
@Table(name = "resumen")
@NoArgsConstructor
@AllArgsConstructor
public class Resumen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "thumbnail", nullable = false)
    private String thumbnail;

    @Column(name = "dayAdded", length = 50, nullable = false)
    private String dayAdded;

    @Column(name = "link", length = 50, nullable = false)
    private String link;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

}
