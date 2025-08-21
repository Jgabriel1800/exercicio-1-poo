public class exercicio5 {
    class StreamingSong {
        String title;
        String artist;
        int duration; // in seconds

        void play(){
            System.out.println("This is " + title + " by " + artist);
        }
    }

    class StreamingSongTestDrive {
        public static void main(String[] args) {
            song.artist = "The Beatles";
            song.title ="Come Together";
            song.play();
            song.printDetails();
        }
    }
}

/* Não compila, pois a variavel 'song' não foi declarada antes de ser usada, o metodo printDetails também não existe. 
 Então,você precisa criar uma instância da classe StreamingSong antes de usar seus atributos.
Criar o método printDetails() dentro da classe StreamingSong, que poderia, por exemplo, imprimir o título, artista e duração.*/ 


class Episode {
    int seriesNumber;
    int episodeNumber;

    void skipIntro(){
        System.out.println("Skipping intro... " );
    }

    void skipToNext(){
        System.out.println("Loading to next episode...");
    }
}

class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        
        episode.play();
        episode.skipIntro();
    }
}

/*O código não compila devido ao método play() inexistente.
O método deve ser colocado dentro da classe Episode, junto com skipIntro() e skipToNext() */ 