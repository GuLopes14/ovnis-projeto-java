package br.com.fiap.ovnis.model;

<<<<<<< HEAD
import java.time.LocalDateTime;

=======
>>>>>>> 8fb2c3a74e0b3265f6e1722ed8401f1a8def694c
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
<<<<<<< HEAD
    private String location;
    private LocalDateTime date;
    private String color;
    
    @Enumerated(EnumType.STRING)
    private Shape shape;

=======
    private String localizacao;
    private String data;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Shape shape;
    
>>>>>>> 8fb2c3a74e0b3265f6e1722ed8401f1a8def694c
    public enum Shape {
        DISC,
        SPHERE,
        TRIANGLE,
        OTHER
    }
<<<<<<< HEAD

    private int quantity;
=======
>>>>>>> 8fb2c3a74e0b3265f6e1722ed8401f1a8def694c
}