import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class AprenderCucumber {
    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {
    }
    @Quando("executá-lo")
    public void executáLo() {
    }
    @Então("a especificação deve finalizar com sucesso")
    public void aEspecificaçãoDeveFinalizarComSucesso() {
    }

    /*********************************************************************************************************/
    private int contador = 0;

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorÉ(Integer int1) {
        contador = int1;
    }
    @Quando("eu incrementar em {int}")
    public void euIncrementarEm(Integer int1) {
        contador = contador + int1;
    }
    @Então("o valor do contador será {int}")
    public void oValorDoContadorSerá(Integer int1) {
//      Assert.assertTrue(contador == int1);
        Assert.assertEquals(Optional.of(int1), Optional.of(contador));
    }
    /*********************************************************************************************************/

    Date entrega = new Date();

    @Dado("que a entrega é dia {int}\\/{int}\\/{int}")
    public void queAEntregaÉDia(Integer dia, Integer mes, Integer ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.YEAR, ano);
        entrega = calendar.getTime();
    }
    @Quando("a entrega atrasar {int} dias")
    public void aEntregaAtrasarDoisDias(Integer int1) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        calendar.add(Calendar.DAY_OF_MONTH,int1);
        entrega = calendar.getTime();
    }
    @Então("a e entrega será efetuada em {int}\\/{int}\\/{int}")
    public void aEEntregaSeráEfetuadaEm(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
