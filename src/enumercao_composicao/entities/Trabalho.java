package enumercao_composicao.entities;

import enumercao_composicao.entities.enums.NivelTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
    private String nome;
    private NivelTrabalho nivel;
    private Double SalarioBase;

    private Departamento departamento;
    private List<HorasContratos> contratos = new ArrayList<>();

    public Trabalho() {

    }

    public Trabalho(String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.SalarioBase = salarioBase;
            this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        SalarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContratos> getContratos() {
        return contratos;
    }

    public void addContrato(HorasContratos contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(HorasContratos contrato) {
        contratos.remove(contrato);
    }
    public double incremento(int mes ,int ano   ){
        double soma = SalarioBase;
        Calendar cal = Calendar.getInstance();
        for(HorasContratos c : contratos){
            cal.setTime(c.getDate());
            int c_ano =cal.get(Calendar.YEAR);
           int c_mes = 1+ cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes)
            soma += c.valorTotal();
        }
        return soma;
    }
}
