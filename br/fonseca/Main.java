package br.fonseca;

	public class Main {
	    public static void main(String[] args) {
	        Gerente gerente = new Gerente(7000.0, "Luciana Soares", "admin", "12345");
	        Telefonista telefonista = new Telefonista(1500.0, "Maria Clara", "3456");
	        Secretaria secretaria = new Secretaria(2500.0, "Ana Julia", 113);

	        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.getSalario());
	        System.out.println("Telefonista: " + telefonista.getNome() + ", Salário: " + telefonista.getSalario());
	        System.out.println("Secretaria: " + secretaria.getNome() + ", Salário: " + secretaria.getSalario());
	    }
	}

