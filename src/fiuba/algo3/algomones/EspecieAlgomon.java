package fiuba.algo3.algomones;


import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;



public enum EspecieAlgomon {
	
	CHARMANDER
	{
		public Algomon nuevo()
		{
			
			int potenciaFogonazo = 2;
			int cantidadMaximaDeAtaquesFogonazo = 4;
			Ataque fogonazo = new AtaqueFogonazo(Tipo.FUEGO, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo);
			
			int potenciaBrasas = 16;
			int cantidadMaximaDeAtaquesBrasas = 10;
			Ataque brasas = new AtaqueSimple(Tipo.FUEGO, potenciaBrasas, cantidadMaximaDeAtaquesBrasas);
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreDelAtaque.BRASAS, brasas);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(170);
			
			return new Algomon("Charmander", Tipo.FUEGO, ataques, salud);
		}
	},
	
	SQUIRTLE
	{
		public Algomon nuevo()
		{
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 16;
			Ataque burbuja = new AtaqueSimple(Tipo.AGUA, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja);
			
			int potenciaCanionDeAgua = 20;
			int cantidadMaximaDeAtaquesCanionDeBurbuja = 8;
			Ataque canionDeAgua = new AtaqueSimple(Tipo.AGUA, potenciaCanionDeAgua, cantidadMaximaDeAtaquesCanionDeBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.CANION_DE_AGUA, canionDeAgua);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(150);
			
			return new Algomon("Squirtle", Tipo.AGUA, ataques, salud);
		}
	}, 
	
	BULBASOUR
	{
		public Algomon nuevo()
		{
			
			int potenciaChupavidas = 15;
			int cantidadMaximaDeAtaquesChupavidas = 8;
			Ataque chupavidas = new AtaqueChupavidas(Tipo.PLANTA, potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas);
			
			int potenciaLatigoCepa = 15;
			int cantidadMaximaDeAtaquesLatigoCepa = 10;
			Ataque latigoCepa = new AtaqueSimple(Tipo.PLANTA, potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
			ataques.put(NombreDelAtaque.LATIGO_CEPA, latigoCepa);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(140);
			
			return new Algomon("Bulbasour", Tipo.PLANTA, ataques, salud);
		}
	}, 
	
	CHANSEY{
		
		public Algomon nuevo()
		{
			
			int potenciaCanto = 0;
			int cantidadMaximaDeAtaquesCanto = 6;
			Ataque canto = new AtaqueCanto(Tipo.NORMAL, potenciaCanto, cantidadMaximaDeAtaquesCanto);
			
			int potenciaLatigoCepa = 15;
			int cantidadMaximaDeAtaquesLatigoCepa = 10;
			Ataque latigoCepa = new AtaqueSimple(Tipo.PLANTA, potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CANTO, canto);
			ataques.put(NombreDelAtaque.LATIGO_CEPA, latigoCepa);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(130);
			
			return new Algomon("Chansey", Tipo.NORMAL, ataques, salud);
		}
		
	}, 
	
	RATTATA {
		
		public Algomon nuevo() {
			
			int potenciaFogonazo = 2;
			int cantidadMaximaDeAtaquesFogonazo = 4;
			Ataque fogonazo = new AtaqueFogonazo(Tipo.FUEGO, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo);
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 15;
			Ataque burbuja = new AtaqueSimple(Tipo.AGUA, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(170);
			
			return new Algomon("Rattata", Tipo.NORMAL, ataques, salud);
			
		}
	}, 
	
	JIGGLYPUFF
	{
		public Algomon nuevo() {
			
			
			int potenciaCanto = 0;
			int cantidadMaximaDeAtaquesCanto = 6;
			Ataque canto = new AtaqueCanto(Tipo.NORMAL, potenciaCanto, cantidadMaximaDeAtaquesCanto);
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 15;
			Ataque burbuja = new AtaqueSimple(Tipo.AGUA, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Ataque ataqueRapido = new AtaqueSimple(Tipo.NORMAL, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CANTO, canto);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(130);
			
			return new Algomon("Jigglypuff", Tipo.NORMAL, ataques, salud);
			
		}
		
		
	};
	
	public abstract Algomon nuevo();
}
