package FacadeCode;

public class HomeTheaterFacade {
    DVDPlayer dvdlayer;
    Projector projector;
    SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdlayer = dvdlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMoview(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdlayer.on();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(8);
        dvdlayer.play(movie);
    }

    // end moview
}
