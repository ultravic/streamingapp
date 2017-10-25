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
    int i, j, k, l;
    for (i = 0; i < directory.getPlaylistSize(); i++) {
      Playlist playlist = directory.getComponent(i);
      System.out.println("###################Playlist######################");
      System.out.println();
      System.out.println("#Playlist " + i + ": " + playlist.getName() + " - " + playlist.getPrimaryStyle() + " - " + playlist.getSecondaryStyle());
      System.out.println();
      for (j = 0; j < playlist.getAlbumSize(); j++) {
        Album album = playlist.getComponent(j);
        System.out.println("#Album " + j + ": " + album.getName() + " - " + album.getStyle());
        for (k = 0; k < album.getMusicSize(); k++) {
          Music music = album.getComponent(k);
          System.out.println("#Music " + k + ": " + music.getName() + " - " + music.getStyle());
        }
        System.out.println();
      }
      for (l = 0; l < playlist.getPlaylistSize(); l++) {
        Playlist subPlaylist = playlist.getComponentPlaylist(l);
        System.out.println("###################subPlaylist######################");
        System.out.println();
        System.out.println("#subPlaylist " + l + ": " + subPlaylist.getName() + " - " + subPlaylist.getPrimaryStyle() + " - " + subPlaylist.getSecondaryStyle());
        System.out.println();
        for (j = 0; j < subPlaylist.getAlbumSize(); j++) {
          Album subAlbum = subPlaylist.getComponent(j);
          System.out.println("#subAlbum " + j + ": " + subAlbum.getName() + " - " + subAlbum.getStyle());
          for (k = 0; k < subAlbum.getMusicSize(); k++) {
            Music subMusic = subAlbum.getComponent(k);
            System.out.println("#subMusic " + k + ": " + subMusic.getName() + " - " + subMusic.getStyle());
          }
          System.out.println();
      }
      System.out.println("#################################################");
      System.out.println();
    }
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
    int i, j, k, l;
    int counter = 0;
    for (i = 0; i < directory.getPlaylistSize(); i++) {
      Playlist playlist = directory.getComponent(i);
      if (playlist.getPrimaryStyle() == this.style || playlist.getSecondaryStyle() == this.style) {
        for (j = 0; j < playlist.getAlbumSize(); j++) {
          Album album = playlist.getComponent(j);
          if (album.getStyle() == this.style) {
            for (k = 0; k < album.getMusicSize(); k++) {
              Music music = album.getComponent(k);
              System.out.println(counter + ": " + music.getName() + " - " + music.getStyle());
              counter++;
            }
          }
        }
      }
      for (l = 0; l < playlist.getPlaylistSize(); l++) {
        Playlist subPlaylist = playlist.getComponentPlaylist(l);
        if (subPlaylist.getPrimaryStyle() == this.style || subPlaylist.getSecondaryStyle() == this.style) {
          for (j = 0; j < subPlaylist.getAlbumSize(); j++) {
            Album subAlbum = subPlaylist.getComponent(j);
            if (subAlbum.getStyle() == this.style) {
              for (k = 0; k < subAlbum.getMusicSize(); k++) {
                Music subMusic = subAlbum.getComponent(k);
                System.out.println(counter + ": " + subMusic.getName() + " - " + subMusic.getStyle());
                counter++;
              }
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
    int i, j, k, l;
    for (i = 0; i < directory.getPlaylistSize(); i++) {
      Playlist playlist = directory.getComponent(i);
      if (playlist.getPrimaryStyle() == this.style || playlist.getSecondaryStyle() == this.style) {
        System.out.println("###################Playlist######################");
        System.out.println();
        System.out.println("#Playlist " + i + ": " + playlist.getName() + " - " + playlist.getPrimaryStyle() + " - " + playlist.getSecondaryStyle());
        System.out.println();
        for (j = 0; j < playlist.getAlbumSize(); j++) {
          Album album = playlist.getComponent(j);
          if (album.getStyle() == this.style) {
            for (k = 0; k < album.getMusicSize(); k++) {
              Music music = album.getComponent(k);
              if (music.getDuration() > 180)
                System.out.println("#Music " + k + ": " + music.getName() + " - " + music.getStyle());
            }
            System.out.println();
          }
        }
        System.out.println("#################################################");
        System.out.println();
      }
      for (l = 0; l < playlist.getPlaylistSize(); l++) {
        Playlist subPlaylist = playlist.getComponentPlaylist(l);
        if (subPlaylist.getPrimaryStyle() == this.style || subPlaylist.getSecondaryStyle() == this.style) {
          System.out.println("###################subPlaylist######################");
          System.out.println();
          System.out.println("#subPlaylist " + l + ": " + subPlaylist.getName() + " - " + subPlaylist.getPrimaryStyle() + " - " + subPlaylist.getSecondaryStyle());
          System.out.println();
          for (j = 0; j < subPlaylist.getAlbumSize(); j++) {
            Album subAlbum = subPlaylist.getComponent(j);
            if (subAlbum.getStyle() == this.style) {
              for (k = 0; k < subAlbum.getMusicSize(); k++) {
                Music subMusic = subAlbum.getComponent(k);
                if (subMusic.getDuration() > 180)
                  System.out.println("#subMusic " + k + ": " + subMusic.getName() + " - " + subMusic.getStyle());
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
}
