package sistemadetestes.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO{

	public ProdutoPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "nav-link" )
	public WebElement voltarButton;
	
	@FindBy(id = "btn-adicionar" )
	public WebElement criarButton;
	
	@FindBy(id = "btn-salvar" )
	public WebElement salvarButton;
	
	@FindBy(className = "navbar-brand")
	public WebElement tituloPagina;
	
	@FindBy(className = "modal")
	public WebElement modal;
	
	@FindBy(id = "mensagem")
	public WebElement spanMensagem;
	
	@FindBy(css = "div.alert>button.close")
	public WebElement xButton;
	
	@FindBy(id = "btn-sair")
	public WebElement closeButton;

	public String obterTitulo() {
		return this.tituloPagina.getText();
	}
	
	public boolean obterModal() {
		return this.modal.isDisplayed();
	}
	
	public boolean obterMsgErro() {
		return this.spanMensagem.isDisplayed();
	}

	
	

}
