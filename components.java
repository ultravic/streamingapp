// Nome: Victor Picussa GRR: 20163068

import java.util.ArrayList;

/*
  =============================================================================
  @ Component classes
  =============================================================================
*/
/*
  =============================================================================
  @ Music
  =============================================================================
*/
class Music extends Component
{
  protected String name, style;
  protected int duration;

  public Music(String name, String style, int duration) {
    this.name = name;
    this.style = style;
    this.duration = duration;
  }

  public String getName() {
    return this.name;
  }

  public String getStyle() {
    return this.style;
  }

  public int getDuration() {
    return this.duration;
  }
}

/*
  =============================================================================
  @ Album
  =============================================================================
*/
class Album extends Component
{
  protected String name, band, style;
  protected ArrayList <Music> musics;

  public Album(String name, String band, String style) {
    this.name = name;
    this.band = band;
    this.style = style;
    this.musics = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public String getBand() {
    return this.band;
  }

  public String getStyle() {
    return this.style;
  }

  public void add(Music music) {
    this.musics.add(music);
  }

  public void remove(Music music) {
    this.musics.remove(music);
  }

  public int getMusicSize() {
    return this.musics.size();
  }

  public Music getComponent(int componentIndex) {
    return this.musics.get(componentIndex);
  }
}

/*
  =============================================================================
  @ Playlist
  =============================================================================
*/
class Playlist extends Component
{
  protected String name, primaryStyle, secondaryStyle;
  protected ArrayList <Album> albuns;

  public Playlist(String name, String primaryStyle, String secondaryStyle) {
    this.name = name;
    this.primaryStyle = primaryStyle;
    this.secondaryStyle = secondaryStyle;
    this.albuns = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public String getPrimaryStyle() {
    return this.primaryStyle;
  }

  public String getSecondaryStyle() {
    return this.secondaryStyle;
  }

  public void add(Album album) {
    this.albuns.add(album);
  }

  public void remove(Album album) {
    this.albuns.remove(album);
  }

  public int getAlbumSize() {
    return this.albuns.size();
  }

  public Album getComponent(int componentIndex) {
    return this.albuns.get(componentIndex);
  }
}

/*
  =============================================================================
  @ Directory
  =============================================================================
*/
class Directory extends Component implements DirectoryElement
{
  protected String name;
  protected ArrayList<Playlist> playlists;

  public Directory(String name) {
    this.name = name;
    this.playlists = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void add(Playlist playlist) {
    this.playlists.add(playlist);
  }

  public void remove(Playlist playlist) {
    this.playlists.remove(playlist);
  }

  public int getPlaylistSize() {
    return this.playlists.size();
  }

  public Playlist getComponent(int componentIndex) {
    return this.playlists.get(componentIndex);
  }

  public void accept(DirectoryElementVisitor visitor) {
    visitor.visit(this);
  }
}

/*
  =============================================================================
  @ Composite class
  =============================================================================
*/
abstract class Component
{
  // Add a component to a list
  public void add(Component component) {
    throw new UnsupportedOperationException();
  }

  // Remove a component from a list
  public void remove(Component component) {
    throw new UnsupportedOperationException();
  }

  // Get a component from a list of components
  public Component getComponent(int componentIndex) {
    throw new UnsupportedOperationException();
  }
}
