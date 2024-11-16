package combate;

public class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public void takeDamage(int dano) {
        int danoEfetivo = Math.max(1, dano - this.armadura); // Garante que pelo menos 1 de dano será causado
        this.vida = Math.max(0, this.vida - danoEfetivo);   // Vida não pode ser menor que 0
    }

    public String status() {
        if (this.vida == 0) {
            return this.nome + ": 0 de vida (morreu)";
        } else {
            return this.nome + ": " + this.vida + " de vida";
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}
