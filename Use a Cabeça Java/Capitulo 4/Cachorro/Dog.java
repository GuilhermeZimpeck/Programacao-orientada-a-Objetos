class Dog {
    int size;
    String name;

    public void bark(){
        if(size > 60) {
            System.out.println("Wooof Woof!!!");
        }else if (size > 14){
            System.out.println("Au Au!!");
        }else{
            System.out.println("Yip yip!");
        }
    }
}
