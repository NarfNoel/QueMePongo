public class PrendaSuperior implements Categoria{
	
	listaDeStrings palabrasClave = [“camisa”, “remera”, “camiseta”];
	

	@Override
	public boolean esValido(String tipoDePrenda) {
		return tipoDePrenda.contains(palabrasClave)
	}
}
