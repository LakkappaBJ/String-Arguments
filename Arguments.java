class Arguments{
	public static void main(String []args){
	System.out.println("open main()\t");
	
		for(int lucky=0;lucky<10;lucky++){
				System.out.print("\t" +args[lucky]);
		}
	System.out.println();
	
		for(int lucky=10;lucky<20;lucky++){
			System.out.print("\t" +args[lucky]);
		
		}
	System.out.println();
	System.out.println("End of the main()");
	}
}