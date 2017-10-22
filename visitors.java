// Nome: Victor Picussa GRR: 20163068

/*
  =============================================================================
  @ Visitor classes
  =============================================================================
*/
interface DirectoryElementVisitor
{
  public void visit(Directory directory);
}

interface DirectoryElement
{
  public void accept(DirectoryElementVisitor visitor);
}

class ListAllVisitor implements DirectoryElementVisitor
{
 public void visit(Directory directory)
 {
  for (int i = 0; i < directory.getPlaylistSize(); i++) {
    Playlist playlist = directory.getComponent(i);
    System.out.println("###################Playlist######################");
    System.out.println();
    System.out.println("#Playlist " + i + ": " + playlist.getName() + " - " + playlist.getPrimaryStyle() + " - " + playlist.getSecondaryStyle());
    System.out.println();
    for (int j = 0; j < playlist.getAlbumSize(); j++) {
      Album album = playlist.getComponent(j);
      System.out.println("#Album " + j + ": " + album.getName() + " - " + album.getStyle());
      for (int k = 0; k < album.getMusicSize(); k++) {
        Music music = album.getComponent(k);
        System.out.println("#Music " + k + ": " + music.getName() + " - " + music.getStyle());
      }
      System.out.println();
    }
    System.out.println("#################################################");
    System.out.println();
  }
 }
}

class ListStyleMusicsVisitor implements DirectoryElementVisitor
{
  public String style;

  public ListStyleMusicsVisitor(String style) {
    this.style = style;
  }

  public void visit(Directory directory)
  {
    int counter = 0;
    for (int i = 0; i < directory.getPlaylistSize(); i++) {
      Playlist playlist = directory.getComponent(i);
      if (playlist.getPrimaryStyle() == this.style || playlist.getSecondaryStyle() == this.style) {
        for (int j = 0; j < playlist.getAlbumSize(); j++) {
          Album album = playlist.getComponent(j);
          if (album.getStyle() == this.style) {
            for (int k = 0; k < album.getMusicSize(); k++) {
              Music music = album.getComponent(k);
              System.out.println(counter + ": " + music.getName() + " - " + music.getStyle());
              counter++;
            }
          }
        }
      }
    }
  }
}

class ListThreeMinutesVisitor implements DirectoryElementVisitor
{
  protected String style;

  public ListThreeMinutesVisitor(String style) {
    this.style = style;
  }

  public void visit(Directory directory)
  {
    for (int i = 0; i < directory.getPlaylistSize(); i++) {
      Playlist playlist = directory.getComponent(i);
      if (playlist.getPrimaryStyle() == this.style || playlist.getSecondaryStyle() == this.style) {
        System.out.println("###################Playlist######################");
        System.out.println();
        System.out.println("#Playlist " + i + ": " + playlist.getName() + " - " + playlist.getPrimaryStyle() + " - " + playlist.getSecondaryStyle());
        System.out.println();
        for (int j = 0; j < playlist.getAlbumSize(); j++) {
          Album album = playlist.getComponent(j);
          if (album.getStyle() == this.style) {
            for (int k = 0; k < album.getMusicSize(); k++) {
              Music music = album.getComponent(k);
              if (music.getDuration() > 180)
                System.out.println(k + ": " + music.getName() + " - " + music.getStyle());
            }
            System.out.println();
          }
        }
        System.out.println("#################################################");
        System.out.println();
      }
    }
  }
}
