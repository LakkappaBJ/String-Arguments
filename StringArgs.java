class StringArgs{
	public static void main(String args[]){
	for(int lucky=0;lucky<args.length;lucky++){
	if(lucky%5==0){
		System.out.println();
	}
	System.out.print(args[lucky]+"\t");
}
	}
}