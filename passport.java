class passport{
	public static void main(String[]args){
	int age = 23;
	Boolean hasPassport = true;	
	Boolean hasNoCriminalRecord = true;
	Boolean passportismissing = false;
	Boolean hascriminalrecord = false;
	if(age >= 18 && hasPassport == true && hasNoCriminalRecord == true){
		System.out.println("visa approved");
}
 	else if(age >= 18 && passportismissing == false && hasNoCriminalRecord == true){
		System.out.println("apply visa");
}
	else if(age < 18 && hascriminalrecord == false){
		System.out.println("visa rejected");
}

}
}