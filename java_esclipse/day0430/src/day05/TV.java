package day05;

class TV {
	private int size;
	private String manufacturer;
	public TV() {
		this(32,"LG");
	}
	public TV(String manufacturer) {
		this(32, manufacturer);
		
	}
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer  = manufacturer;
		System.out.println(size + "ÀÎÄ¡" + manufacturer);
	}
	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV("»ï¼º");
	}
}
