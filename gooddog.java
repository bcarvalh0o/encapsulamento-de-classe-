 class gooddog {
    private int size;

    public int getSize(){
        return size;
    }
    
public void setSize (int s) {
    size = s;
}

void bark(){
    if (size > 60){
        System.out.println("Woof Woof Woof");
    }
else if(size  > 14){
    System.out.println("Ruf Ruf");
}
else{
    System.out.println("bééeéé");
}
}
}

class gooddogTestDrive{
    public static void main(String[] args) {
    gooddog one = new gooddog();
    one.setSize(70);

    gooddog two = new gooddog();
    two.setSize(8);

    gooddog three = new gooddog();
    three.setSize(15);

    System.out.println("O primeiro cachorro:" + one.getSize());
    System.out.println("O segundo cachorro :" + two.getSize());
    System.out.println("O terceiro cachorro:" + three.getSize());

    one.bark();
    two.bark();
    three.bark();
    }
    }