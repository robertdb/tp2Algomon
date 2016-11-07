package fiuba.algo3.Algomones;


import java.util.ArrayList;
import java.util.List;



public enum EspecieAlgomon {
	
	CHARMANDER
	{
		public Algomon nuevo()
		{
			
			//Ataque brasas = new AtaqueSimple(TipoDeAtaque.BRASAS);
			//Ataque ataqueRapido = new AtaqueSimple(TipoDeAtaque.ATAQUE_RAPIDO);
			//Ataque fogonazo = new AtaqueConEfecto(TipoDeAtaque.FOGONAZO);
			List<Ataque> ataques = new ArrayList<Ataque>();
			//ataques.add(brasas);
			//ataques.add(ataqueRapido);
			//ataques.add(fogonazo);
			return new Algomon("Charmander", "Fuego", ataques);
		}
	},
	
	SQUIRTLE
	{
		public Algomon nuevo()
		{
			Ataque burbuja = new AtaqueSimple(TipoDeAtaque.BURBUJA);
			Ataque canionDeAgua = new AtaqueSimple(TipoDeAtaque.CANION_DE_AGUA);
			Ataque ataqueRapido = new AtaqueSimple(TipoDeAtaque.ATAQUE_RAPIDO);
			List<Ataque> ataques = new ArrayList<Ataque>();
			ataques.add(burbuja);
			ataques.add(canionDeAgua);
			ataques.add(ataqueRapido);
			
			return new Algomon("Squirtle", "Agua", ataques);
		}
	};
	
	public abstract Algomon nuevo();
}
