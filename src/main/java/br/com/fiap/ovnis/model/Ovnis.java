package br.com.fiap.ovnis.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "ovnis")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ovnis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String localizacao;
    private String data;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Shape shape;
    
    public enum Shape {
        DISC,
        SPHERE,
        TRIANGLE,
        OTHER
    }
}