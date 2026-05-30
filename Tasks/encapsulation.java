class encapsulation{
	private int id;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public static void main(String args[]){
		encapsulation obj=new encapsulation();
		obj.setId(45);
		System.out.println(obj.getId());
	}
}