package main.java.br.com.portfolio.titulos.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="titulos_publicos")
public class TituloPublico {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_titulo", length = 50, nullable = false)
    private String nomeTitulo;

    @Column(length = 25, nullable = false)
    private String tipo;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate dataVencimento;

    @Column(name = "taxa_anual", precision=10, scale=4, nullable = false)
    private BigDecimal taxaAnual;

    @Column(name = "preco_unitario", precision=19, scale=2, nullable = false)
    private BigDecimal precoUnitario;

    @CreationTimestamp
    @Column(name = "data_registro", nullable = false, updatable = false)
    private LocalDateTime dataRegistro;

    // Construtor default (sem argumentos)
    public TituloPublico() {
    }

    // Construtor completo
    public TituloPublico(String nomeTitulo, String tipo, LocalDate dataVencimento, BigDecimal taxaAnual, BigDecimal precoUnitario, LocalDateTime dataRegistro) {
        this.nomeTitulo = nomeTitulo;
        this.tipo = tipo;
        this.dataVencimento = dataVencimento;
        this.taxaAnual = taxaAnual;
        this.precoUnitario = precoUnitario;
        this.dataRegistro = dataRegistro;
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public BigDecimal getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(BigDecimal taxaAnual) {
        this.taxaAnual = taxaAnual;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }
}
