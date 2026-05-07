package Day6.Assigment;

class Box {
    int length;
    
    Box(int length) {
        this.length = length;
    }
}

class Que2 {
    public static void changeLength(Box b, int newLen) {
        b.length = newLen;
    }
    
    public static void main(String[] args) {
        Box box = new Box(5);
        System.out.println("Before: " + box.length); 
        
        changeLength(box, 10);
        
        System.out.println("After: " + box.length); 
    }
}