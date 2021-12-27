//Write a program to print each 5 elements in row..
class Fruits{
	public static void main(String []args){
	int num=0;
	for(int i=0;i<args.length;i++){
		if(num==5){
			System.out.println();
			num=0;
		}
		System.out.print(args[i]+"\t");
		num=num+1; //num++
	}
	
	}

}