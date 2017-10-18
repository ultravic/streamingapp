import java.util.ArrayList;
/*
  =============================================================================
  @ Main Program
  =============================================================================
*/
class Program {
  public static void main(String[] args) {

  }
}

/*
  =============================================================================
  @ Music, Album and Playlist classes
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

  public String getDuration() {
    return this.duration;
  }
}

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
    return this.band
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

  public Music getComponent(int componentIndex) {
    return this.musics.get(componentIndex);
  }
}

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

  public Album getComponent(int componentIndex) {
    return this.albuns.get(componentIndex);
  }
}

class Directory extends Component implements DirectoryElement
{
  String name;
  protected ArrayList<Playlist> playlists;

  public Directory(String name) {
    this.name = name;
    this.playlists = ArrayList<>();
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

/*
  =============================================================================
  @ Singleton classes
  =============================================================================
*/
class Singleton
{
  private static Singleton firstInstance = null;

  private Singleton() {}

  public static Singleton getInstance() {
    if(firstInstance == null)
      firstInstance = new Singleton();

    return firstInstance;
  }
}

/*
  =============================================================================
  @ Visitor classes
  =============================================================================
*/
interface DirectoryElementVisitor
{
  public void visit(Directory list);
}

interface DirectoryElement
{
  public void accept(DirectoryElementVisitor visitor);
}

class ListAllVisitor implements DirectoryElementVisitor
{
 public void visit(Directory directory)
 {
   for (directory.playlists : playlist) {
     System.out.println(playlist.getName() + ' ' + playlist.getPrimaryStyle() + ' ' + playlist.getSecondaryStyle());
     for (playlist.albuns : album) {
       System.out.println(album.getName() + ' ' + album.getStyle());
       for (album.musics : music)
        System.out.println(music.getName() + ' ' music.getStyle());
     }
   }
 }
}

class ListStyleMusicsVisitor implements DirectoryElementVisitor
{
 public void visit(Directory directory, String style)
 {
   for (directory.playlists : playlist) {
     if (playlist.getPrimaryStyle() == style OU playlist.getSecondaryStyle() == style)
       for (playlist.albuns : album) {
         if (playlist.getStyle() == style)
           for (album.musics : music)
            System.out.println(music.getName() + ' ' music.getStyle());
 }
}

class ListThreeMinutesVisitor implements DirectoryElementVisitor
{
 public void visit(Directory directory, String style)
 {
   for (directory.playlists : playlist) {
     if (playlist.getPrimaryStyle() == style OU playlist.getSecondaryStyle() == style)
       for (playlist.albuns : album) {
         if (playlist.getStyle() == style)
           for (album.musics : music)
            if (music.getDuration() >= 180)
              System.out.println(music.getName() + ' ' music.getStyle());
 }
}
