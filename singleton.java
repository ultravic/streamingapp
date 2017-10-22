// Nome: Victor Picussa GRR: 20163068

/*
  =============================================================================
  @ Singleton class
  =============================================================================
*/
class StreamingApp
{
  private static StreamingApp firstInstance = null;
  protected String name, plan;
  protected Directory directory;

  private StreamingApp(String name, String plan) {
    this.name = name;
    this.plan = plan;
    this.directory = new Directory("Directory of " + name);
  }

  public static StreamingApp getInstance(String name, String plan) {
    if(firstInstance == null)
      firstInstance = new StreamingApp(name, plan);

    return firstInstance;
  }

  public String getName() {
    return this.name;
  }

  public String getPlan() {
    return this.plan;
  }

  public Directory getDirectory() {
    return this.directory;
  }

  public void add(Playlist playlist) {
    this.directory.add(playlist);
  }

  public void remove(Playlist playlist) {
    this.directory.remove(playlist);
  }
}
