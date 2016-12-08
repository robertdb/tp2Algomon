package fiuba.algo3.algomones;

public enum TipoElemento {
	POCION{
		@Override
		public Elemento nuevo() {
			
			return new Pocion();
		}

		@Override
		public String NombreElemento() {
			// TODO Auto-generated method stub
			return "Pocion";
		}
	}, 
	SUPERPOCION{
		@Override
		public Elemento nuevo(){
			return new SuperPocion();
		}

		@Override
		public String NombreElemento() {
			// TODO Auto-generated method stub
			return "SuperPocion";
		}
		
	}, VITAMINA{
		@Override
		public Elemento nuevo(){
			return new Vitamina();
		}

		@Override
		public String NombreElemento() {
			// TODO Auto-generated method stub
			return "vitamina";
		}
		
	}, RESTAURADOR{
		@Override
		public Elemento nuevo(){
			return new Restaurador();
		}

		@Override
		public String NombreElemento() {
			// TODO Auto-generated method stub
			return "Restaurador";
		}
	};

	public abstract Elemento nuevo();
	public abstract String NombreElemento();
}
