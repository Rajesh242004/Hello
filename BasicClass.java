 class Students{
    int marks;
    String name;
    int rollno;
    
    public void show(){
        System.out.println(marks+" "+name+" "+rollno);
    }

}
class BasicClass{
    public static void main(String args[]){
        Students obj1 = new Students();
        obj1.marks=56;
        obj1.name="john";
        obj1.rollno=1;

        Students obj2 = new Students();
        obj2.marks=45;
        obj2.name="cena";
        obj2.rollno=2;

        Students obj3 = new Students();
        obj3.marks=87;
        obj3.name="roman";
        obj3.rollno=3;

        obj1.show();
        obj2.show();
        obj3.show();

    }
}