/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes para
 * desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Guilherme Carvalho
 * @version 1.0
 * @since 17/09/2023
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   primeiro parâmetro do método
     * @param numeroDois segundo parâmetro do método
     * @return retorna o resultado da soma dos parâmetros (int).
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    /**
     * Este método é utilizado para subtrair dois números inteiros
     * 
     * @param numeroUm   primeiro parâmetro do método
     * @param numeroDois segundo parâmetro do método
     * @return retorna o resultado da subtração dos parâmetros (int).
     */

    public int subtrair(int numeroUm, int numeroDois) {
        return numeroUm - numeroDois;
    }

    /**
     * Este método é utilizado para multiplicar dois números inteiros
     * 
     * @param numeroUm   primeiro parâmetro do método
     * @param numeroDois segundo parâmetro do método
     * @return retorna o resultado da multiplicação dos parâmetros (int).
     */

    public int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }

    /**
     * Este método é utilizado para dividir dois números inteiros
     * 
     * @param numeroUm   primeiro parâmetro do método
     * @param numeroDois segundo parâmetro do método
     * @return retorna o resultado da divisão dos parâmetros (int).
     */

    public int dividir(int numeroUm, int numeroDois) {
        return numeroUm / numeroDois;
    }

    /**
     * Este método é utilizado para calcular a raiz quadrada de um número
     * 
     * @param numeroUm primeiro parâmetro do método
     * @return retorna o resultado da raiz quadrada dos parâmetros (int).
     */
    public int raizQuadrada(int numeroUm) {
        return (int) Math.sqrt(numeroUm);
    }

    /**
     * Este método é utilizado para calcular o fatorial de um número
     * 
     * @param numeroUm primeiro parâmetro do método
     * @return retorna o resultado do fatorial dos parâmetros (int).
     */
    public int fatorial(int numeroUm) {
        int fatorial = 1;
        for (int i = 1; i <= numeroUm; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
