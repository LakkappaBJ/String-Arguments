class Car{
	public static void main(String args[]){
		System.out.println("open the method()....");
		
		for(int i=0;i<5;i++){
				System.out.print("\t"+args[i]);
		}
		System.out.println();
		
		for(int j=5;j<10;j++){
			System.out.print("\t"+args[j]);
		}
		System.out.println();
		System.out.println("End the method()");
	}
}