
public class Prenda {
	String tipoDePrenda;
	Categoria categoria;
	String tela;
	String colorPrincipal;
	String colorSecundario;

	
	Prenda(String categoria, String tipoDePrenda, String tela, String colorPrincipal, String colorSecundario){
		
		if (esNull(categoria)){
			throw new exception("no se pudo setear");
			}else{
			this.categoria = categoria;
		}
		
		if (esNull(tipoDePrenda)) {
			throw new exception("no se pudo setear");
		}else if(categoria.esValido(tipoDePrenda)){
			this.tipoDePrenda = tipoDePrenda;
		}else {
			throw new exception("el tipo de prenda no coincide con la categoria")
		}
		
		if (esNull(tela)) {
			throw new exception("no se pudo setear");
			}else{
			this.tela = tela;
		}
		
		if (esNull(colorPrincipal)) {
			throw new exception("no se pudo setear");
			}else{
			this.colorPrincipal = colorPrincipal;
		}
		
		this.colorSecundario = colorSecundario;
	}
	
	boolean esNull(String categoria) {
		return categoria == null;
	}
}





