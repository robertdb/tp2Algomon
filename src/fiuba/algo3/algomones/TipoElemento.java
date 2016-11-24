package fiuba.algo3.algomones;

public enum TipoElemento {
	POCION{
		@Override
		public Elemento nuevo() {
			
			return new Pocion();
		}
	}, 
	SUPERPOCION{
		@Override
		public Elemento nuevo(){
			return new SuperPocion();
		}
		
	}, VITAMINA{
		@Override
		public Elemento nuevo(){
			return new Vitamina();
		}
		
	}, RESTAURADOR{
		@Override
		public Elemento nuevo(){
			return new Restaurador();
		}
	};

	public abstract Elemento nuevo();
}
