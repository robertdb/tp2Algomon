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
			Tipo tipoFuego1 = new TipoFuego();
			Ataque fogonazo = new AtaqueDurable(tipoFuego1, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo);
			
			int potenciaBrasas = 16;
			int cantidadMaximaDeAtaquesBrasas = 10;
			Tipo tipoFuego2 = new TipoFuego();
			Ataque brasas = new AtaqueSimple(tipoFuego2, potenciaBrasas, cantidadMaximaDeAtaquesBrasas);
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreDelAtaque.BRASAS, brasas);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(170);
			Tipo fuego = new TipoFuego();
			return new Algomon("Charmander", fuego, ataques, salud);
		}
	},
	
	SQUIRTLE
	{
		public Algomon nuevo()
		{
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 16;
			Tipo tipoAgua1 = new TipoAgua();
			Ataque burbuja = new AtaqueSimple(tipoAgua1, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja);
			
			int potenciaCanionDeAgua = 20;
			int cantidadMaximaDeAtaquesCanionDeBurbuja = 8;
			Tipo tipoAgua2 = new TipoAgua();
			Ataque canionDeAgua = new AtaqueSimple(tipoAgua2, potenciaCanionDeAgua, cantidadMaximaDeAtaquesCanionDeBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.CANION_DE_AGUA, canionDeAgua);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(150);
			Tipo agua = new TipoAgua();
			return new Algomon("Squirtle", agua, ataques, salud);
		}
	}, 
	
	BULBASOUR
	{
		public Algomon nuevo()
		{
			
			int potenciaChupavidas = 15;
			int cantidadMaximaDeAtaquesChupavidas = 8;
			Tipo tipoPlanta1 = new TipoPlanta();
			Ataque chupavidas = new AtaqueChupavidas(tipoPlanta1, potenciaChupavidas, cantidadMaximaDeAtaquesChupavidas);
			
			int potenciaLatigoCepa = 15;
			int cantidadMaximaDeAtaquesLatigoCepa = 10;
			Tipo tipoPlanta2 = new TipoPlanta();
			Ataque latigoCepa = new AtaqueSimple(tipoPlanta2, potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CHUPAVIDAS, chupavidas);
			ataques.put(NombreDelAtaque.LATIGO_CEPA, latigoCepa);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(140);
			Tipo planta = new TipoPlanta();
			return new Algomon("Bulbasour", planta, ataques, salud);
		}
	}, 
	
	CHANSEY{
		
		public Algomon nuevo()
		{
			
			int potenciaCanto = 0;
			int cantidadMaximaDeAtaquesCanto = 6;
			Tipo tipoNormal1 = new TipoNormal();
			Ataque canto = new AtaqueDurable(tipoNormal1, potenciaCanto, cantidadMaximaDeAtaquesCanto);
			
			int potenciaLatigoCepa = 15;
			int cantidadMaximaDeAtaquesLatigoCepa = 10;
			Tipo tipoPlanta = new TipoPlanta();
			Ataque latigoCepa = new AtaqueSimple(tipoPlanta, potenciaLatigoCepa, cantidadMaximaDeAtaquesLatigoCepa );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal2 = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal2, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CANTO, canto);
			ataques.put(NombreDelAtaque.LATIGO_CEPA, latigoCepa);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO,ataqueRapido);
			
			Salud salud = new Salud(130);
			Tipo normal = new TipoNormal();
			return new Algomon("Chansey", normal, ataques, salud);
		}
		
	}, 
	
	RATTATA {
		
		public Algomon nuevo() {
			
			int potenciaFogonazo = 2;
			int cantidadMaximaDeAtaquesFogonazo = 4;
			Tipo tipoFuego = new TipoFuego();
			Ataque fogonazo = new AtaqueDurable(tipoFuego, potenciaFogonazo, cantidadMaximaDeAtaquesFogonazo);
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 15;
			Tipo tipoAgua = new TipoAgua();
			Ataque burbuja = new AtaqueSimple(tipoAgua, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(170);
			Tipo normal = new TipoNormal();
			return new Algomon("Rattata", normal, ataques, salud);
			
		}
	}, 
	
	JIGGLYPUFF
	{
		public Algomon nuevo() {
			
			
			int potenciaCanto = 0;
			int cantidadMaximaDeAtaquesCanto = 6;
			Tipo tipoNormal1 = new TipoNormal();
			Ataque canto = new AtaqueDurable(tipoNormal1, potenciaCanto, cantidadMaximaDeAtaquesCanto);
			
			int potenciaBurbuja = 10;
			int cantidadMaximaDeAtaquesBurbuja = 15;
			Tipo tipoAgua = new TipoAgua();
			Ataque burbuja = new AtaqueSimple(tipoAgua, potenciaBurbuja, cantidadMaximaDeAtaquesBurbuja );
			
			int potenciaAtaqueRapido = 10;
			int cantidadMaximaDeAtaquesAtaqueRapido = 16;
			Tipo tipoNormal2 = new TipoNormal();
			Ataque ataqueRapido = new AtaqueSimple(tipoNormal2, potenciaAtaqueRapido , cantidadMaximaDeAtaquesAtaqueRapido );
			
			
			EnumMap<NombreDelAtaque, Ataque> ataques = new EnumMap<NombreDelAtaque, Ataque >(NombreDelAtaque.class);
			ataques.put(NombreDelAtaque.CANTO, canto);
			ataques.put(NombreDelAtaque.BURBUJA, burbuja);
			ataques.put(NombreDelAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			Salud salud = new Salud(130);
			Tipo normal = new TipoNormal();
			return new Algomon("Jigglypuff", normal, ataques, salud);
			
		}
		
		
	};
	
	public abstract Algomon nuevo();
}
