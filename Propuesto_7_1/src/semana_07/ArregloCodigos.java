package semana_07;

public class ArregloCodigos {
	
	//Atributos privados
	private int[] codigo;
	private int indice;
	//String[] nuevoVector = new String[miVector.length - 1];
	
	//Constructor
	public ArregloCodigos() {
		codigo = new int[10];
		indice = 0;
	}
	
	//Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	
	public int obtener(int i) {
		return codigo[i];
	}
	
	public void adicionar(int numero) {
		if (indice == codigo.length)
			ampliarArreglo();
		codigo[indice] = numero;
		indice++;
	}
	
	//Operaciones públicas complementarias
	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}
	
	//Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = codigo;
		codigo = new int[indice + 10];
		for (int i = 0; i < indice; i++)
			codigo[i] = aux[i];
	}
	
	public void intercambiarSegPen() {
		for(int i=0; i<indice; i++) {
			int aux = codigo[1];
			codigo[1] = codigo[indice-2];
			codigo[indice-2] = aux;
			break;
		}
	}
	
	public void eliminarPrimero() {
		if(indice>0) {
			int[] nuevoCodigo = new int[10];
			for(int i = 1; i < indice; i++) {
				nuevoCodigo[i-1] = codigo[i];
			}
			codigo = nuevoCodigo;
			indice--;
		}
	}
	
	
	public int posCodigo() {
		for(int i=indice-1; i>=0; i--) {
			if((codigo[i]>=1000) && (codigo[i]<=1111)) {
				return i;
			}
		}
		return -1;
	}
	
	public void intercambiarCodigo() {
		for(int i=indice-1; i>=0; i--) {
			if((codigo[i]>=1000) && (codigo[i]<=1111)) {
				int aux = codigo[2];
				codigo[2] = codigo[i];
				codigo[i] = aux;
				break;
			}
		}
	}
	
	public void eliminarCodigo() {
		for(int i=indice-1; i>=0; i--) {
			int cont=i;
			if((codigo[i]>=1000) && (codigo[i]<=1111)) {
				codigo[cont] = codigo[cont+1];
				cont++;
				break;
			}
			indice--;
		}
	}
}
