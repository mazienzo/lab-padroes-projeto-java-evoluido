package one.digitalinnovation.gof.strategy;

//Implementamos a interface Comportamento, o que significa que o nosso robô agora sabe como "fugir" quando necessário, seguindo exatamente o contrato do padrão Strategy.
public class ComportamentoFugir implements Comportamento {

    @Override
    public void mover() {
        System.out.println("A fugir rapidamente do perigo! 🏃‍♂️💨");
    }
}