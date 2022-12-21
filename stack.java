class NilaiMatkul {
    String nim;
    String nama;
    double nilai;

    NilaiMatkul() {
    }    
}

class Stack {
    int top;
    NilaiMatkul[] data = new NilaiMatkul[10];
    
    Stack() {
        for (int i = 0; i < 10; i++) {
            data[i] = new NilaiMatkul();
        }
    }
    
    void createEmpty() {
        top = -1;
    }
    
    boolean isEmpty() {
        boolean hasil = false;
        
        if (top == -1) {
            hasil = true;
        }
        
        return hasil;
    }
    
    boolean isFull() {
        boolean hasil = false;
        
        if (top == data.length - 1) {
            hasil = true;
        }
        
        return hasil;
    }
    
    void push(String nim, String nama, double nilai) {
        if (isFull() == true) {
            // jika stack penuh
            System.out.println("Stacknya penuh bos");
        } else {
            if (isEmpty() == true) {
                // jika stack kosong
                top = 0;
                data[0].nim = nim;
                data[0].nama = nama;
                data[0].nilai = nilai;
            } else {
                // jika stack tidak kosong
                top = top + 1;
                data[top].nim = nim;
                data[top].nama = nama;
                data[top].nilai = nilai;
            }
        }
    }
    
    void pop() {
        if (top == 0) {
            // jika stack berisi satu elemen
            top = -1;
        } else {
            if (top != -1) {
                // jika stack tidak kosong
                top = top - 1;
            } 
        }
    }
    
    void printStack() {
        if (top != -1) {
            System.out.println("--------------------------------");
            int i;
            
            for (i = top; i >= 0; i--) {
                System.out.println("==================================");
                System.out.println("elemen ke-" + (i + 1));
                System.out.println("nim : " + data[i].nim);
                System.out.println("nama : " + data[i].nama);
                System.out.println("nilai : " + data[i].nilai);
                System.out.println("--------------------------------");
            }
            
        } else {
            // proses jika stacknya kosong
            System.out.println("stack kosong");
        }
    }
}

public class stack {
    public static void main(String[] args) {
        
        Stack S = new Stack();
        
        S.createEmpty();
        S.printStack();
        
        System.out.println("==================================");
        
        S.push("13822", "bahrunnur", 72.43);
        S.push("13823", "bahrunnar", 62.21);
        S.push("13824", "bahrunyu", 89.45);
        
        S.printStack();
        
        System.out.println("==================================");
        
        S.pop();
        S.pop();
        S.printStack();
        
        System.out.println("==================================");
        
    }
}