import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
@Test
public void somarComSucesso(){
    //Arranjo
    Calculadora calculadora = new Calculadora();

    //Act = Ação
    int resultadoSoma = calculadora.somar(40, 10);

    //Assert
    Assert.assertEquals(50, resultadoSoma);
}

public void subtrairComSucesso(){
    Calculadora calculadora = new Calculadora();
    int resultadoSubtrair = calculadora.subtrair(20, 10);
    Assert.assertEquals(10 , resultadoSubtrair);
}

public void multiplicarComSucesso(){
    Calculadora calculadora = new Calculadora();
    int resultadoMultiplicar = calculadora.multiplicar(5, 4);
    Assert.assertEquals(20, resultadoMultiplicar);
}

public void dividirComSucesso(){
    Calculadora calculadora =  new Calculadora();
    int resultadoDividir = calculadora.dividir(50, 5);
    Assert.assertEquals(10, resultadoDividir);
}
public void potenciarComSucesso(){
    Calculadora calculadora =new Calculadora();
    int resultadoPonteciar =calculadora.potenciar(2, 2);
    Assert.assertEquals(4, resultadoPonteciar);
}
}
