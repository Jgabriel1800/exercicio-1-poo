class Exercisela {
    public static void main(String[] args){
        int x = 1 ;
        while (x < 10){
            if (x > 3){
                System.out.println("big x");
            }
        }
    }
    
}

// O valor de X não muda dentro do loop, logo ficará em loop infinito!

public static void main (String[] args) {
    int x = 5;
    while (x > 1){
        x = x -1;
        if (x < 3){
            System.out.println("small x");
        }
    }
}

// Compila normalmente, acontece a saída "small x". 


class Exerciselc {
    int x = 5;
    while (x > 1){
        x = x -1;
        if (x < 3){
            System.out.println("small x");
        }
    }
}

// Precisa colocar o while dentro de um método, normalmente o main