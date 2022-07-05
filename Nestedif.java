class Nestedif {
public static void main(String[] args) {
String address = "Kolkata, India";
if(address.endswith("India")) {
if(address.contains("Dunlop")) {
System.out.println("Your city is Dunlop");
}
else if(address.contains("Newtown")) {

System.out.println("Your city is Newtown");
}
else {

System.out.printl(address.split(",")[0]);
}
}
else {
System.out.println("You are not living in India"); 
}
}
}