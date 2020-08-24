package Q2;

import java.util.Date;

public final class Song {
    private final Musician musician;
    private final String songTitle;
    private final Date songDate; //java.util.Date

    public Song(Musician musician, String songTitle, Date songDate) {
        this.musician = new Musician(musician.getFirstName(),musician.getLastName());
        this.songTitle = songTitle;
        this.songDate = new Date(songDate.getTime());
    }

    public Musician getMusician() {
        return new Musician(musician.getFirstName(),musician.getLastName());
    }

    public String getSongTitle() {
        return songTitle;
    }

    public Date getSongDate() {
        return new Date(songDate.getTime());
    }
}