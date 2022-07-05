class Parametercons {
  String name;
     Parametercons (String name){
         this.name = name;
     System.out.println("cons called");

     }
     public static void main(String [] args) {
         Parametercons obj=new Parametercons ("java");
         Parametercons obj1=new Parametercons ("c++");
         Parametercons obj2=new Parametercons ("c");
     System.out.println("The name is" +  obj.name);
     System.out.println("The name is" +  obj1.name);
     System.out.println("The name is" +  obj2.name);
     }
     }
