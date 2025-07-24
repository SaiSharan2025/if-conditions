class health_insurance{
public static void main(String[]args){
	int age = 17;
	if(age>60){
	 System.out.println("5000");
}
	else if (age<40 && age>60){
	 System.out.println("3000");
}
	else if (age>20 && age<39){
	 System.out.println("1500");
}
	else
	 System.out.println("1000");

}
}