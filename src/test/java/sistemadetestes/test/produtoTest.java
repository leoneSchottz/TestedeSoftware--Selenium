package sistemadetestes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import sistemadetestes.pageObject.ProdutoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class produtoTest extends BaseTest{
	
	private static ProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new ProdutoPO(driver);
	}
	
	@Test
	public void TC001_deveVoltarParaTelaLogin() {
		
		produtoPage.voltarButton.click();
		
		String mensagem = produtoPage.obterTitulo();
		assertNotEquals(mensagem, "Controle de produtos");
	}
	
	@Test
	public void TC003_deveAparecerModalDeProduto() {
		
		produtoPage.criarButton.click();
		produtoPage.criarButton.click();
		boolean temModal = produtoPage.modal.isDisplayed();
		
		assertTrue(temModal);
	}
	
	@Test
	public void TC005_deveFecharMensagemErroModal() {
		
		produtoPage.salvarButton.click();
		produtoPage.salvarButton.click();
		produtoPage.xButton.click();
		
		boolean temMsgErro = produtoPage.obterMsgErro();
		assertFalse(temMsgErro);
	}
	
	
}