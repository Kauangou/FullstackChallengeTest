package Entities;

import Enums.Estado;

import java.util.Objects;

public class Apartamento {

    int id, numero;
    Estado estado;

    public Apartamento() {
    }

    public Apartamento(int id, int numero) {
        setId(id);
        setNumero(numero);
        setEstado(Estado.LIVRE);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void adicionarApartamento(int id, int numero){
        this.setId(id);
        this.setNumero(numero);
        this.setEstado(Estado.LIVRE);
    }

    public void atualizarApartamento(int numero, Estado estado){
        this.setNumero(numero);
        this.setEstado(estado);
    }

    public void deletarApartamento(){
        this.setNumero(numero);
        this.setEstado(estado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamento that = (Apartamento) o;
        return id == that.id && numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero);
    }
}
