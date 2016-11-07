package fiuba.algo3.Algomones;


import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;



public enum EspecieAlgomon {
	
	CHARMANDER
	{
		public Algomon nuevo()
		{
			
			//Ataque brasas = new AtaqueSimple(TipoDeAtaque.BRASAS);
			//Ataque ataqueRapido = new AtaqueSimple(TipoDeAtaque.ATAQUE_RAPIDO);
			//Ataque fogonazo = new AtaqueConEfecto(TipoDeAtaque.FOGONAZO);
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			//ataques.add(brasas);
			//ataques.add(ataqueRapido);
			//ataques.add(fogonazo);
			Salud salud = new Salud(170);
			return new Algomon("Charmander", TipoDeAtaque.FUEGO, ataques, salud);
		}
	},
	
	SQUIRTLE
	{
		public Algomon nuevo()
		{
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 16;
			Ataque burbuja = new AtaqueSimple(TipoDeAtaque.AGUA, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja);
			
			int potenciaCanionDeAgua = 20;
			int cantidadMaximaDeAtaquesCanionDeBurbuja = 8;
			Ataque canionDeAgua = new AtaqueSimple(TipoDeAtaque.AGUA, potenciaCanionDeAgua, cantidadMaximaDeAtaquesCanionDeBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(TipoDeAtaque.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.CANION_DE_AGUA, canionDeAgua);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(150);
			
			return new Algomon("Squirtle", TipoDeAtaque.AGUA, ataques, salud);
		}
	};
	
	public abstract Algomon nuevo();
}
